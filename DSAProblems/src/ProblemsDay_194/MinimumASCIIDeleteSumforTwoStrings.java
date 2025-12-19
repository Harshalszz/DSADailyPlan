package ProblemsDay_194;

public class MinimumASCIIDeleteSumforTwoStrings {
//https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings/?envType=problem-list-v2&envId=string

    public int minimumDeleteSum(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[] dp = new int[n + 1];

        for (int j = 1; j <= n; j++) {
            dp[j] = dp[j - 1] + s2.charAt(j - 1);
        }

        for (int i = 1; i <= m; i++) {
            int prev = dp[0];
            dp[0] += s1.charAt(i - 1);

            for (int j = 1; j <= n; j++) {
                int temp = dp[j];

                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[j] = prev;
                } else {
                    dp[j] = Math.min(dp[j] + s1.charAt(i - 1), dp[j - 1] + s2.charAt(j - 1));
                }

                prev = temp;
            }
        }

        return dp[n];
    }
    public static void main(String[] args) {

    }
}
