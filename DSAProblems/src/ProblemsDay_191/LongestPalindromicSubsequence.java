package ProblemsDay_191;

public class LongestPalindromicSubsequence {
//https://leetcode.com/problems/longest-palindromic-subsequence/?envType=problem-list-v2&envId=string
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        return solve(s, 0, n - 1, dp);
    }

    public int solve(String s, int i, int j, int[][] dp) {
        if (i > j) {
            return 0;
        }
        if (i == j) {
            return 1;
        }


        if (dp[i][j] != 0) {
            return dp[i][j];
        }

        if (s.charAt(i) == s.charAt(j)) {
            dp[i][j] = 2 + solve(s, i + 1, j - 1, dp);
        } else {
            dp[i][j] = Math.max(solve(s, i, j - 1, dp), solve(s, i + 1, j, dp));
        }

        return dp[i][j];
    }
    public static void main(String[] args) {

    }
}
