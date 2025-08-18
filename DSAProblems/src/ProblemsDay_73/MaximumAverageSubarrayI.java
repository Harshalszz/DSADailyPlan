package ProblemsDay_73;

public class MaximumAverageSubarrayI {

    //https://leetcode.com/problems/maximum-average-subarray-i/?envType=study-plan-v2&envId=leetcode-75


    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        int maxSum = sum;

        for(int i=k ; i<nums.length; i++){
            sum += nums[i] - nums[i-k];
            maxSum = Math.max(sum, maxSum);
        }

        return (double) maxSum/k;

    }
    public static void main(String[] args) {

    }
}
