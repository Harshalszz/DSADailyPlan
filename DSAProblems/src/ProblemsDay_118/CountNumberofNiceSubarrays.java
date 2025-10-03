package ProblemsDay_118;

public class CountNumberofNiceSubarrays {

    //https://leetcode.com/problems/count-number-of-nice-subarrays/?envType=problem-list-v2&envId=sliding-window
    public int numberOfSubarrays(int[] nums, int k) {
        return subarrays(nums, k) - subarrays(nums, k - 1);
    }
    private int subarrays(int[] nums, int k){
        int left = 0;
        int c = 0;  // count of odds
        int ans = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] % 2 == 1){
                c++;
            }
            while(right >= left && c > k){
                if(nums[left] % 2 == 1){
                    c--;
                }
                left++;
            }
            ans += (right - left + 1);
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
