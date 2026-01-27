package ProblemsDay_233;

public class MaximumSubarray {

    //https://leetcode.com/problems/maximum-subarray/
    public int maxSubArray(int[] nums) {

        int currSum =0;
        int maxSum = Integer.MIN_VALUE;

        for(int n : nums){
            currSum +=n;
            if(currSum >maxSum){
                maxSum=currSum;
            }

            if(currSum <0){
                currSum =0;
            }
        }

        return maxSum;

    }
    public static void main(String[] args) {

    }
}
