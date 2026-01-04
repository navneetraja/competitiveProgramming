package Graph;

import com.sun.tools.jconsole.JConsoleContext;

import java.util.*;

public class AdjacencyMatrixToList {

    public static ArrayList<ArrayList<Integer>> convertToAdjList(char[][] matrix) {
        int n = matrix.length;

        System.out.println("n "+n);
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
                if (i != j && matrix[i][j] == '1') {
                    adjList.get(i).add(j);
                }
            }
            System.out.println(" ");

        }

        return adjList;
    }

    public static void printAdjList(ArrayList<ArrayList<Integer>> adjList) {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print(i + " -> ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Sample Adjacency Matrix (Undirected or Directed)
//        int[][] adjMatrix = {
//            {1, 1, 1, 1, 0},
//            {1, 1, 0, 1, 0},
//            {1, 1, 0, 0, 0},
//            {0, 0, 0, 0, 0},
//        };

        char[][] adjMatrix = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };



        ArrayList<ArrayList<Integer>> adjList = convertToAdjList(adjMatrix);

        System.out.println("Adjacency List:");
        printAdjList(adjList);

        int v = 6;
        int noOfIslands = 0;
        boolean [] visited = new boolean[v];
        for(int i =0;i<v;i++){
            if(!visited[i]){
                noOfIslands++;
                dfsRec(adjList, visited, i);
            }
        }
        System.out.println("noOfIslands "+noOfIslands);
        //return noOfIslands;

        Solution sol = new Solution();
        //int island = sol.numIslands(adjMatrix);
        //System.out.println("island "+island);

    }

    static void dfsRec(ArrayList<ArrayList<Integer>> adjList, boolean [] visited, int node){
        visited[node] = true;

        for(Integer n : adjList.get(node)){
            if(!visited[n]){
                dfsRec(adjList,visited,n);
            }
        }
    }
}
