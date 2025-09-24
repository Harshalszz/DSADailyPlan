package ProblemsDay_110;

import java.util.Arrays;

public class MaximumSumCircularSubarray {
//https://leetcode.com/problems/maximum-sum-circular-subarray/?envType=study-plan-v2&envId=top-interview-150

    public int kadanesMinMax(int[] arr,int n,int flag){
        int currSum=arr[0],sum=arr[0];
        for(int i=1;i<n;i++){
            if(flag == 1){
                sum = Math.max(arr[i],sum+arr[i]);
                currSum = Math.max(sum,currSum);
            }else{
                sum = Math.min(arr[i],sum+arr[i]);
                currSum = Math.min(sum,currSum);
            }

        }
        return currSum;
    }


    public int maxSubarraySumCircular(int[] arr) {
        int n = arr.length;
        int s = Arrays.stream(arr).sum();
        int min = kadanesMinMax(arr,n,0);
        int max = kadanesMinMax(arr,n,1);
        int cic = s-min;
        if(max>0) return Math.max(cic,max);
        return max;
    }

    public static void main(String[] args) {

    }
}
