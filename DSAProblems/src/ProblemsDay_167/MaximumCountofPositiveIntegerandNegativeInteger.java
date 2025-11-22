package ProblemsDay_167;

public class MaximumCountofPositiveIntegerandNegativeInteger {
//https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
    public int maximumCount(int[] nums) {
        int n = nums.length;

        int postiveIndex = n - binarySearch(nums, true);
        int negativeIndex = binarySearch(nums,false) + 1;

        return Math.max(postiveIndex,negativeIndex);
    }

    private int binarySearch(int[] nums, boolean isPos){

        int start = 0, end = nums.length -1;

        while(start <=end){

            int mid = start + (end -start)/2;

            if(isPos){
                if(nums[mid] >0){
                    end = mid -1;
                }else{
                    start = mid+1;
                }
            }else{
                if(nums[mid] <0){
                    start = mid +1;
                }else{
                    end = mid -1;
                }
            }
        }

        return isPos == true ? start : end;
    }
    public static void main(String[] args) {

    }
}
