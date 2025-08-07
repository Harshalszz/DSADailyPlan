package ProblemsDay_62;

public class MinimumOperationsExceedThresholdValueI {
    //https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i/

    public int minOperations(int[] nums, int k) {


        int ans = 0;

        for(int n:nums){
            if(n<k){
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
