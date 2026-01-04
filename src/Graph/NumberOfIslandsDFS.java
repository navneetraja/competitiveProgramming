package Graph;

public class NumberOfIslandsDFS {

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;

        int islandCount = 0;
        int m = grid.length;
        int n = grid[0].length;

        // Traverse the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If land is found, perform DFS
                if (grid[i][j] == '1') {
                    islandCount++;
                    dfs(grid, i, j);
                }
            }
        }
        return islandCount;
    }

    // DFS to mark connected land as visited
    private void dfs(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;

        // Boundary check or if current cell is water
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] != '1') {
            return;
        }

        // Mark current cell as visited
        grid[i][j] = '0';

        // Explore all 4 directions
        dfs(grid, i - 1, j); // Up
        dfs(grid, i + 1, j); // Down
        dfs(grid, i, j - 1); // Left
        dfs(grid, i, j + 1); // Right
    }

    // Main method to test
    public static void main(String[] args) {
        NumberOfIslandsDFS obj = new NumberOfIslandsDFS();

        char[][] grid1 = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };

        char[][] grid2 = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };

        System.out.println("Islands in grid1: " + obj.numIslands(grid1)); // Output: 1
        System.out.println("Islands in grid2: " + obj.numIslands(grid2)); // Output: 3
    }
}
