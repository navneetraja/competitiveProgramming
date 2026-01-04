package Graph;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class AdjacencyList {

    public static void dfsGraph(ArrayList<ArrayList<Integer>> adj, boolean [] visited, ArrayList<Integer> dfs, int s ){
        dfs.add(s);
        visited[s] = true;
        for(Integer n:adj.get(s)){
            if(!visited[n]){
                dfsGraph(adj,visited,dfs,n);
            }
        }
    }

    public static ArrayList<Integer> bfsGraph(ArrayList<ArrayList<Integer>> adj, int V, int s){

        ArrayList<Integer> bfsTraversalList  = new ArrayList<>();
        boolean visited[] = new boolean[V];

        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        visited[s]= true;
        while(!q.isEmpty()){
            int node = q.poll();
            bfsTraversalList.add(node);

            for(Integer n:adj.get(node)){
                if(!visited[n]){
                    visited[n] = true;
                    q.add(n);
                }

            }
        }
        return bfsTraversalList;

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

        ArrayList<Integer> g = bfsGraph(adj,v,1);

        ArrayList<Integer> dfs = new ArrayList<>();
        boolean[] visited = new boolean[v];
        dfsGraph(adj,visited,dfs,1);
        for(Integer node:g){
            System.out.print(node + " - ");
        }
        System.out.println("DFS");
        for(Integer node:dfs){
            System.out.print(node + " - ");
        }
    }


}
