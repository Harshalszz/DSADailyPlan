package ProblemsDay_60;

import java.util.Arrays;

public class MaximumGap {
    //https://leetcode.com/problems/maximum-gap/

    public int maximumGap(int[] nums) {

        if(nums.length <2){
            return 0;
        }

        Arrays.sort(nums);

        int max = Integer.MIN_VALUE;

        for(int i = 1 ;i < nums.length;i++){
            max = Math.max(max, nums[i] - nums[i-1]);
        }

        return max;

    }

    public static void main(String[] args) {

    }
}
