package ProblemsDay8;

import java.util.Arrays;

public class TwoSumII {
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
    public static  int[] isTwoSumII(int nums[], int target){
        int l =0 , r= nums.length - 1;

        while(l<r){
            int sum = nums[l] + nums[r];
            if(sum > target ){
                r--;
            }else if(sum < target){
                l++;
            }else{
                // l= l+1;
                // r = r+1;
                return new int[]{l+1, r+1};
            }
        }

        return new int[]{-1,-1};
    }

    public static void main(String[] args) {

        int[] nums = {2,7,11,15}; int target = 9;

        System.out.println(Arrays.toString(isTwoSumII(nums,target)));

    }
}
