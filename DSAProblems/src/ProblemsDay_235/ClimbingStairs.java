package ProblemsDay_235;

public class ClimbingStairs {
//https://leetcode.com/problems/climbing-stairs/
    private int[] memo;
    public int climbStairs(int n) {
        memo = new int[n+1];

        return helper(n);



    }

    public int helper(int n){

        if(n<=1){
            return 1;
        }
        if(memo[n] != 0){
            return memo[n];
        }
        int i= helper(n-1);
        int j = helper(n-2);
        memo[n] = i+j;
        return memo[n];

    }
    public static void main(String[] args) {

    }
}
