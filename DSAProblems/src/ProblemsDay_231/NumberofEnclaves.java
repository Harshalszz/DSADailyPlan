package ProblemsDay_231;

public class NumberofEnclaves {
//https://leetcode.com/problems/number-of-enclaves/?envType=problem-list-v2&envId=array

    public int numEnclaves(int[][] grid) {
        //jo land points boundary par hai and since they cant be counted if they are lying on boundary
        //unko we will grid[x][y]=0 and call dfs on the neighbouring points
        int nrow = grid.length;
        int ncol = grid[0].length;

        //considering the points on boundary
        for (int row = 0; row < nrow; row++) {
            if (grid[row][0] == 1) {
                dfs(row, 0, grid);
            }

            //last column
            if (grid[row][ncol - 1] == 1) {
                dfs(row, ncol - 1, grid);
            }
        }

        for (int col = 0; col < ncol; col++) {
            if (grid[0][col] == 1) {
                dfs(0, col, grid);
            }

            if (grid[nrow - 1][col] == 1) {
                dfs(nrow - 1, col, grid);
            }
        }

        int count = 0;

        for (int row = 1; row < nrow - 1; row++) {
            for (int col = 1; col < ncol - 1; col++) {
                if (grid[row][col] == 1) {
                    count++;
                }
            }
        }

        return count;
    }

    static void dfs(int row, int col, int[][] grid) {
        int nrow = grid.length;
        int ncol = grid[0].length;

        // WRITE CONDITIONS CAREFULLY !!!
        if (row < 0 || row >= nrow || col < 0 || col >= ncol || grid[row][col] == 0)
            return;

        grid[row][col] = 0;

        int[][] options = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

        for (int[] opt : options) {
            int x = row + opt[0];
            int y = col + opt[1];

            dfs(x, y, grid);
        }
    }
    public static void main(String[] args) {

    }
}
