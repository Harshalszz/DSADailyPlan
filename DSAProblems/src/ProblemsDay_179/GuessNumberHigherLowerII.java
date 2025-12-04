package ProblemsDay_179;

import java.util.Arrays;

public class GuessNumberHigherLowerII {

    //https://leetcode.com/problems/guess-number-higher-or-lower-ii/
    private int solveRec(int start, int end){
        if(start >= end){
            return 0;
        }

        int ans = Integer.MAX_VALUE;
        for(int i=start; i<=end; i++){
            ans = Math.min(ans, i + Math.max(solveRec(start, i-1), solveRec(i+1, end)));
        }
        return ans;
    }

    // Recursive + Memoization
    private int solveMemo(int start, int end, int [][]dp){
        if(start >= end) return 0;

        // Step-3 => Check before Calling if Found in DP return
        if(dp[start][end] != -1){
            return dp[start][end];
        }

        // Step-2 => Recursive Calls and Store the answer int DP-array
        int ans = Integer.MAX_VALUE;
        for(int i=start; i<=end; i++){
            ans = Math.min(ans, i+Math.max(solveMemo(start,i-1,dp), solveMemo(i+1,end,dp)));
        }
        return dp[start][end]=ans;
    }

    public int getMoneyAmount(int n) {
/*
//  Recursive Call
        return solveRec(1, n);
*/


//  DP(Recursive + Memoization)
        // step-1 => DP Creation....
        int [][]dp = new int[n+1][n+1];
        for(var i:dp){
            Arrays.fill(i, -1);
        }

        return solveMemo(1, n, dp);
    }

    public static void main(String[] args) {

    }
}
