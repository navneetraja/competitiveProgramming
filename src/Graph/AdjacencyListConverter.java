package Graph;

import java.util.*;

public class AdjacencyListConverter {

    public List<List<Integer>> convertToAdjList(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int totalNodes = m * n;

        // Initialize the adjacency list with empty lists
        List<List<Integer>> adjList = new ArrayList<>(totalNodes);
        for (int i = 0; i < totalNodes; i++) {
            adjList.add(new ArrayList<>());
        }

        // Directions: up, down, left, right
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // Build the adjacency list
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    int node = i * n + j;
                    for (int[] dir : directions) {
                        int ni = i + dir[0];
                        int nj = j + dir[1];
                        if (ni >= 0 && nj >= 0 && ni < m && nj < n && grid[ni][nj] == '1') {
                            int neighbor = ni * n + nj;
                            adjList.get(node).add(neighbor);
                        }
                    }
                }
            }
        }
        return adjList;
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };

        AdjacencyListConverter obj = new AdjacencyListConverter();
        List<List<Integer>> adjList = obj.convertToAdjList(grid);

        // Print the adjacency list
        for (int i = 0; i < adjList.size(); i++) {
            if (!adjList.get(i).isEmpty()) {
                System.out.println("Node " + i + " -> " + adjList.get(i));
            }
        }
    }

    static void dfsRec(List<List<Integer>> adjList, boolean [] visited, int node){
        visited[node] = true;

        for(Integer n : adjList.get(node)){
            if(!visited[n]){
                dfsRec(adjList,visited,n);
            }
        }
    }
}
