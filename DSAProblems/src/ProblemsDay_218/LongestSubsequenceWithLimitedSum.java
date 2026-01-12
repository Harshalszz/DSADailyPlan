package ProblemsDay_218;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum {

    //https://leetcode.com/problems/longest-subsequence-with-limited-sum/?envType=problem-list-v2&envId=binary-search
    public int[] answerQueries(int[] nums, int[] q) {
        int[] res = new int[q.length];

        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++)      // calculate prefix
            nums[i] = nums[i] + nums[i-1];

        for(int i=0; i<q.length; i++)       // search and build res
            res[i] = search(nums, q[i]);

        return res;
    }

    int search(int[] nums, int find){
        int left = 0, right = nums.length-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(nums[mid]==find) return mid+1;
            if(nums[mid]<find) left = mid+1;
            else right = mid;
        }
        return nums[left]<=find ? left+1: left;
    }
    public static void main(String[] args) {

    }
}
