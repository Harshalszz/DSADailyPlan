package ProblemsDay_114;

import java.util.Arrays;

public class LargestPositiveIntegerThatExistsWithItsNegative {
//https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/
    public int findMaxK(int[] nums) {

        int left = 0, right = nums.length-1;
        Arrays.sort(nums);
        int maxE = Integer.MIN_VALUE;

        while(left < right){
            int sum = nums[left] + nums[right];

            if(sum == 0){
                maxE = Math.max(maxE, nums[right]);
                left++;
                right--;
            }else if(sum < 0){
                left++;
            }else{
                right--;
            }
        }


        return maxE != Integer.MIN_VALUE ? maxE : -1;
    }

    public static void main(String[] args) {

    }
}
