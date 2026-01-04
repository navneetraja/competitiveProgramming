package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {


    static ArrayList<Integer> bfsTraversal(ArrayList<ArrayList<Integer>> adj, int noOfVertex, int sourceVertex){
        boolean [] visited = new boolean[noOfVertex];
        visited[sourceVertex] = true;
        ArrayList<Integer> vertexList = new ArrayList<>();

        Queue<Integer> q = new LinkedList<>();
        q.add(sourceVertex);
        while(!q.isEmpty()){
            int node = q.poll();
            vertexList.add(node);
            for(Integer n : adj.get(node)){
                if(!visited[n]){
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
        return vertexList;

    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static  void main(String [] args){
        int v = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);

        for(int i=0;i<v;i++){
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,1,2);
        addEdge(adj,1,3);
        addEdge(adj,2,4);
        addEdge(adj,3,5);

        ArrayList<Integer> g = bfsTraversal(adj,v,1);
        for(Integer node:g){
            System.out.print(node + " - ");
        }
    }
}
