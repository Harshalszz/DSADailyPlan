package ProblemsDay_58;

public class ClimbingStairs {
    //https://leetcode.com/problems/climbing-stairs/

    public int climbStairs(int n) {
        if(n==0 || n==1){
            return 1;
        }

        int prev = 1, current = 1;

        for(int i=2; i<=n;i++){
            int temp = current;
            current += prev;
            prev = temp;
        }

        return current;

    }

    public static void main(String[] args) {

    }
}
