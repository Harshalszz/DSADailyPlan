package ProblemsDay_164;

import java.util.Arrays;

//https://leetcode.com/problems/maximum-product-of-three-numbers/?envType=problem-list-v2&envId=array
public class MaximumProductofThreeNumbers {

    public int maximumProduct(int[] nums) {
        // int res = 1;
        // Arrays.sort(nums);

        // for(int i=nums.length-1; i>= nums.length -3; i--){
        //     res *=nums[i];
        // }

        // return res;
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        int a=nums[0]*nums[1]*nums[nums.length-1];
        int b=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        return (a>b)? a : b ;
    }
    public static void main(String[] args) {

    }
}
