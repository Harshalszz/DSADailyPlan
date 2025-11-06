package ProblemsDay_151;

import java.util.Arrays;

public class MaximizeSumOfArrayAfterKNegations {
//https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/?envType=problem-list-v2&envId=sorting
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                if(k>0){
                    nums[i]=nums[i]*-1;
                    k--;
                }
            }else if(nums[i]==0){
                k=0;
                break;
            }
        }

        Arrays.sort(nums);

        if(k>0){
            if(k%2==0){
                nums[0]=nums[0];
            }else{
                nums[0]=nums[0]*-1;
            }
        }



        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {

    }
}
