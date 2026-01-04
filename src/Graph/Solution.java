package Graph;

import java.util.*;
class Solution {
    public int numIslands(char[][] grid) {


        int m = grid.length;
        int n = grid[0].length;

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < m; i++) {
            adjList.add(new ArrayList<>());
            for (int j = 0; j < m; j++) {
                if (i != j && grid[i][j] == '1') {
                    adjList.get(i).add(j);
                }
            }
        }

        int v = 4;
        int noOfIslands = 0;
        boolean [] visited = new boolean[v];
        for(int i =0;i<v;i++){
            if(!visited[i]){
                noOfIslands++;
                dfsRec(adjList, visited, i);
            }
        }
        return noOfIslands;
        
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