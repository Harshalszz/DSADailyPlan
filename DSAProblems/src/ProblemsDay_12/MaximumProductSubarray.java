package ProblemsDay_12;

public class MaximumProductSubarray {
//https://leetcode.com/problems/maximum-product-subarray/description/
    public static int maximumProductSubarray(int[] nums){
        int res = Integer.MIN_VALUE;
        int prefix = 1, suffix = 1 , n = nums.length;

        for(int i =0 ; i<n ; i++){

            if(prefix == 0 ) {prefix = 1;}
            if(suffix == 0) {suffix = 1;}

            prefix *= nums[i];
            suffix *=nums[n-i-1];

            res = Math.max(res, Math.max(prefix, suffix));
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(maximumProductSubarray(nums));
    }
}
