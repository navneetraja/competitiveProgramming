package Graph;

import java.util.*;

public class GridBFSTraversal {

    public static void bfsTraversal(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();

        // Starting from (0, 0)
        queue.offer(new int[]{0, 0});
        visited[0][0] = true;

        // Directions: up, down, left, right
        int[][] directions = {
            {-1, 0}, // Up
            {1, 0},  // Down
            {0, -1}, // Left
            {0, 1}   // Right
        };

        System.out.println("BFS Traversal of Grid:");

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int row = cell[0], col = cell[1];

            // Print visited cell
            System.out.println("Visited cell: (" + row + ", " + col + ")");

            // Explore neighbors
            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                // Boundary and visited check
                if (newRow >= 0 && newRow < m &&
                    newCol >= 0 && newCol < n &&
                    !visited[newRow][newCol]) {

                    queue.offer(new int[]{newRow, newCol});
                    visited[newRow][newCol] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] grid = new int[3][3];  // 3x3 empty grid
        bfsTraversal(grid);
    }
}
