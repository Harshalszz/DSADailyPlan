package ProblemsDay_88;

import java.util.Arrays;

public class DominoandTrominoTilingSolution1 {
    // recursive approach
    // TC = o(n)
    //SC = o(n*n)
     private int[][] dp;
     private final int MOD = 1_000_000_007;

     private int countTilingWays(int r1, int r2) {
         if (r1 == 0 && r2 == 0) return 1; // Valid tiling completed
         if (r1 <= 0 || r2 <= 0) return 0; // Invalid tiling

         if (dp[r1][r2] != -1) return dp[r1][r2];

         long count = 0;

         if (r1 == r2) {
             count += countTilingWays(r1 - 2, r2 - 2); // Horizontally tile row-1 & row-2
             count += countTilingWays(r1 - 1, r2 - 1); // Vertically tile row-1 & row-2
             count += countTilingWays(r1 - 2, r2 - 1); // Inverted L shape
             count += countTilingWays(r1 - 1, r2 - 2); // Mirror L shape
         } else if (r1 > r2) {
             count += countTilingWays(r1 - 2, r2);     // Horizontally tile row-1
             count += countTilingWays(r1 - 2, r2 - 1); // Inverted L Mirror shape
         } else {
             count += countTilingWays(r1, r2 - 2);     // Horizontally tile row-2
             count += countTilingWays(r1 - 1, r2 - 2); // L shape
         }

         dp[r1][r2] = (int)(count % MOD);
         return dp[r1][r2];
     }

     public int numTilings(int n) {
         dp = new int[n + 1][n + 1];

         for (int[] row : dp) {
             Arrays.fill(row, -1);
         }

         return countTilingWays(n, n);
     }

    public static void main(String[] args) {

    }
}
