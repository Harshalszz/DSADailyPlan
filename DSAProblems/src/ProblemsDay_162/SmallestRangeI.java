package ProblemsDay_162;

public class SmallestRangeI {

    //https://leetcode.com/problems/smallest-range-i/?envType=problem-list-v2&envId=array
    public int smallestRangeI(int[] nums, int k) {
        int min=nums[0];
        int max=nums[0];

        for(int num:nums){
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        return Math.max(0,max-min-2*k);
    }
    public static void main(String[] args) {

    }
}
