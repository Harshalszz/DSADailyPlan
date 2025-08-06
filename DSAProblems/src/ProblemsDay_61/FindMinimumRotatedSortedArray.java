package ProblemsDay_61;

public class FindMinimumRotatedSortedArray {
    //https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

    public int findMin(int[] nums) {

        int start =0, end = nums.length-1;

        while(start<end){
            int mid = start + (end-start)/2;

            if(nums[mid] < nums[end]){
                end = mid;
            }else{
                start = mid+1;
            }
        }

        return nums[start];

    }

    public static void main(String[] args) {

    }
}
