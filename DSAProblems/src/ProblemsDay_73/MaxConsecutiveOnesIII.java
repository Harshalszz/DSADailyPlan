package ProblemsDay_73;

public class MaxConsecutiveOnesIII {

    //https://leetcode.com/problems/max-consecutive-ones-iii/?envType=study-plan-v2&envId=leetcode-75

    public int longestOnes(int[] nums, int k) {

        int countZero = 0;
        int left=0, right=0;
        int ans = 0;

        while(right<nums.length){
            if(nums[right] == 0){
                countZero++;
            }

            while(countZero>k){
                if(nums[left] == 0){
                    countZero--;
                }
                left++;
            }

            ans = Math.max(ans , right - left +1);
            right++;
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
