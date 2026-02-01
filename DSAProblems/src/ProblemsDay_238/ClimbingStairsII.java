package ProblemsDay_238;

import java.util.Arrays;

public class ClimbingStairsII {
//https://leetcode.com/problems/climbing-stairs-ii/
    public int climbStairs(int n, int[] costs) {
        long INF = (long)1e18;
        long[] dp = new long[n + 1];
        Arrays.fill(dp, INF);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int jump = 1; jump <= 3; jump++) {
                int j = i + jump;
                if (j <= n) {
                    dp[j] = Math.min(dp[j],
                            dp[i] + costs[j - 1] + (long)jump * jump);
                }
            }
        }
        return (int) dp[n];
    }
    public static void main(String[] args) {

    }
}
