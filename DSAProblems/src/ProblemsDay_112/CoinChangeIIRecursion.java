package ProblemsDay_112;

import java.util.Arrays;

public class CoinChangeIIRecursion {

    //https://leetcode.com/problems/coin-change-ii/

    public int change(int amount, int[] coins) {
        int[][] dp = new int[amount + 1][coins.length];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return coin(amount, coins, 0, dp);
    }

    private static int coin(int amount, int[] coins, int ind, int[][] dp) {
        if (amount == 0) return 1;        // valid way
        if (ind == coins.length) return 0; // no coins left
        if (dp[amount][ind] != -1) return dp[amount][ind];

        int pick = 0;
        if (amount >= coins[ind]) {
            pick = coin(amount - coins[ind], coins, ind, dp); // stay at same coin (infinite supply)
        }
        int noPick = coin(amount, coins, ind + 1, dp); // move to next coin

        return dp[amount][ind] = pick + noPick;
    }

    public static void main(String[] args) {

    }
}
