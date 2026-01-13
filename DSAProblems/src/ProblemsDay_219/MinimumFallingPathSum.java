package ProblemsDay_219;

import java.util.Arrays;

public class MinimumFallingPathSum {

    //https://leetcode.com/problems/minimum-falling-path-sum/?envType=problem-list-v2&envId=array
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];

        // Initialize dp with a sentinel value
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        int ans = Integer.MAX_VALUE;

        // Try starting from every column in the first row
        for (int col = 0; col < n; col++) {
            ans = Math.min(ans, dfs(matrix, 0, col, dp));
        }

        return ans;
    }

    // Returns minimum falling path sum starting from (row, col)
    private int dfs(int[][] matrix, int row, int col, int[][] dp) {

        // Out of bounds (invalid column)
        if (col < 0 || col >= matrix.length) {
            return (int) 1e9;
        }

        // Last row → path ends here
        if (row == matrix.length - 1) {
            return matrix[row][col];
        }

        // Already computed
        if (dp[row][col] != Integer.MAX_VALUE) {
            return dp[row][col];
        }

        int down = dfs(matrix, row + 1, col, dp);
        int left = dfs(matrix, row + 1, col - 1, dp);
        int right = dfs(matrix, row + 1, col + 1, dp);

        // Current cell value + minimum of three possible moves
        return dp[row][col] =
                matrix[row][col] + Math.min(down, Math.min(left, right));
    }
    public static void main(String[] args) {

    }
}
