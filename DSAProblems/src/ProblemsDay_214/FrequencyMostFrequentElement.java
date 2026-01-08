package ProblemsDay_214;

import java.util.Arrays;

public class FrequencyMostFrequentElement {

    //https://leetcode.com/problems/frequency-of-the-most-frequent-element/?envType=problem-list-v2&envId=sliding-window
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        long windowSum = 0;
        int result = 1;

        for(int right=0; right<nums.length; right++) {
            windowSum += nums[right];
            long cost = (long) nums[right] * (right - left + 1) - windowSum;

            while(cost > k) {
                windowSum -= nums[left];
                left++;
                cost = (long) nums[right] * (right - left + 1) - windowSum;
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
