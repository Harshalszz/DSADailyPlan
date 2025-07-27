package ProblemsDay_51;

public class MonotonicArray {
    //https://leetcode.com/problems/monotonic-array/description/

    public static boolean isMonotonic(int[] nums) {

        boolean isAsc = true;
        boolean isDsc = true;

        for(int i=1;i<nums.length;i++){
            if(nums[i-1] > nums[i]){
                isAsc = false;
            }

            if(nums[i-1] < nums[i]){
                isDsc= false;
            }
        }

        return isAsc || isDsc;
    }

    public static void main(String[] args) {

        int[] nums = {6,5,4,4,8};

        System.out.println(isMonotonic(nums));

    }
}
