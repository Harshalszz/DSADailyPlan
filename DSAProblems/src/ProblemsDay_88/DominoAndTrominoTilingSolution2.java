package ProblemsDay_88;

public class DominoAndTrominoTilingSolution2 {
    //https://leetcode.com/problems/domino-and-tromino-tiling/?envType=study-plan-v2&envId=leetcode-75

    // tabularnation method.
// formula = dp[n] = 2* dp[n-1] + dp[n-3]
    public int numTilings(int n) {
        if (n < 3) return n;

        int MOD = 1_000_000_007;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (int)((2L * dp[i - 1] + dp[i - 3]) % MOD);
        }

        return dp[n];
    }

    public static void main(String[] args) {

    }
}
