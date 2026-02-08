package ProblemsDay_245;

public class SquaresSortedArray {

    // https://leetcode.com/problems/squares-of-a-sorted-array/
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];

        int left = 0 , right = nums.length-1;

        for(int i= nums.length-1; i>=0 ; i-- ){

            if(Math.abs(nums[left]) > Math.abs(nums[right])){

                ans[i] = nums[left] * nums[left];
                left++;
            }else{
                ans[i] = nums[right] * nums[right];
                right--;
            }
        }


        return ans;
    }
    public static void main(String[] args) {

    }
}
