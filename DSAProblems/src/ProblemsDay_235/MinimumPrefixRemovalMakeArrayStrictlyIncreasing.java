package ProblemsDay_235;

public class MinimumPrefixRemovalMakeArrayStrictlyIncreasing {
//https://leetcode.com/problems/minimum-prefix-removal-to-make-array-strictly-increasing/
    public int minimumPrefixLength(int[] nums) {

        int i = nums.length-1;

        while(i>0 && nums[i-1] <nums[i]){
            i--;
        }

        return i;

    }
    public static void main(String[] args) {

    }
}
