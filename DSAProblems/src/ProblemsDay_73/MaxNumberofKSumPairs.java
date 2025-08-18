package ProblemsDay_73;

import java.util.Arrays;

public class MaxNumberofKSumPairs {
    //https://leetcode.com/problems/max-number-of-k-sum-pairs/?envType=study-plan-v2&envId=leetcode-75

    public int maxOperations(int[] nums, int k) {

        Arrays.sort(nums);

        int left =0, right = nums.length-1;
        int maxOperation = 0;

        while(left<right){

            if(nums[left] + nums[right] == k){
                left++;
                right--;
                maxOperation++;
            }else if(nums[left] + nums[right] < k){
                left++;
            }else{
                right--;
            }
        }

        return maxOperation;

    }

    public static void main(String[] args) {

    }
}
