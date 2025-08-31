package ProblemsDay_86;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximumSubsequenceScore {
    //https://leetcode.com/problems/maximum-subsequence-score/?envType=study-plan-v2&envId=leetcode-75

    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n=nums1.length;
        int [][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=nums1[i];
            arr[i][1]=nums2[i];
        }
        Arrays.sort(arr,(a, b)->b[1]-a[1]);
        long ans=0;
        long sum=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(arr[i][0]);
            sum+=arr[i][0];
            if(pq.size()>k){
                sum=sum-pq.poll();
            }
            if(pq.size()==k){
                ans=Math.max(ans,sum*arr[i][1]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
