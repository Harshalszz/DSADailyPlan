package ProblemsDay_50;

public class LongestNiceSubarray {

//https://leetcode.com/problems/longest-nice-subarray/
    public int longestNiceSubarray(int[] nums) {
        // if x & y = 0
        // which means no 1 bits is in same position of two numbers x,y
        // x xor y = x+y
        // 3 -> 0011
        // 8 -> 1000
        // 3^ 8 = 1011 = 12
        // 3+8 = 12
        int start = 0;
        int currSum = 0;
        int currXor = 0;
        int maxLen =0 ;

        for(int end = 0; end<nums.length; end++){
            currSum += nums[end];
            currXor ^= nums[end];
            // if x+y != x^y
            while(currSum != currXor){
                // shrink the window
                // by subtracting the start from currSum
                // and x^x =0
                currSum -= nums[start];
                currXor ^= nums[start];
                start++;
            }

            maxLen = Math.max(maxLen, end-start+1);
        }

        return maxLen;

    }
    public static void main(String[] args) {

    }
}
