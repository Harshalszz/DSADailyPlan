package ProblemsDay_238;

public class ClimbingStairs {
//https://leetcode.com/problems/climbing-stairs/
    int[] memo;
    public int climbStairs(int n) {
        memo = new int[n+1];
        return solve(n);
    }

    private int solve(int n){

        if(n <=1){
            return 1;
        }

        if(memo[n] !=0){
            return memo[n];
        }

        memo[n] = solve(n-1) + solve(n-2);
        return memo[n];
    }
    public static void main(String[] args) {

    }
}
