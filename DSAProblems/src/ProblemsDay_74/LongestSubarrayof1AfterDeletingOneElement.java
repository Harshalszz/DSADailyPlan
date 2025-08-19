package ProblemsDay_74;

public class LongestSubarrayof1AfterDeletingOneElement {

    //https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/?envType=study-plan-v2&envId=leetcode-75
    public int longestSubarray(int[] nums) {

        int left = 0, right = 0;
        int zeroCount = 0;
        int ans =0;

        while(right<nums.length){
            if(nums[right] == 0){
                zeroCount++;
            }

            while(zeroCount>1){
                if(nums[left] == 0){
                    zeroCount--;
                }

                left++;
            }

            ans = Math.max(ans , right - left);
            right++;
        }

        return ans;

    }
    public static void main(String[] args) {

    }
}
