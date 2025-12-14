package ProblemsDay_189;

import java.util.Arrays;

public class MinimumMovesEqualArrayElementsII {

    //https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/?envType=problem-list-v2&envId=array
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        int count=0;
        while(start < end){
            count+=nums[end]-nums[start];
            start++;
            end--;
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
