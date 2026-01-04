package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslandsBFS {

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;

        int islandCount = 0;
        int m = grid.length;
        int n = grid[0].length;

        // Traverse each cell
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Found an unvisited land
                if (grid[i][j] == '1') {
                    islandCount++;
                    bfs(grid, i, j);
                }
            }
        }
        return islandCount;
    }

    private void bfs(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        grid[i][j] = '0'; // mark visited

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int row = cell[0], col = cell[1];

            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                // Check boundaries and unvisited land
                if (newRow >= 0 && newRow < m &&
                    newCol >= 0 && newCol < n &&
                    grid[newRow][newCol] == '1') {

                    queue.offer(new int[]{newRow, newCol});
                    grid[newRow][newCol] = '0'; // mark visited
                }
            }
        }
    }

    public static void main(String[] args) {
        NumberOfIslandsBFS obj = new NumberOfIslandsBFS();

        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };

        System.out.println("Number of islands: " + obj.numIslands(grid));  // Output: 3
    }
}
