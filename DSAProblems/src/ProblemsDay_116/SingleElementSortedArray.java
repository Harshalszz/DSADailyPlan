package ProblemsDay_116;

public class SingleElementSortedArray {


    //https://leetcode.com/problems/single-element-in-a-sorted-array/?envType=study-plan-v2&envId=binary-search
    public int singleNonDuplicate(int[] nums) {

        // int res = nums[0];

        // for(int i=1; i<nums.length; i++){
        //     res ^= nums[i];
        // }

        // return res;

        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Ensure mid is even
            if (mid % 2 == 1) {
                mid--;
            }

            // Check pair
            if (nums[mid] == nums[mid + 1]) {
                // Unique element is on the right
                left = mid + 2;
            } else {
                // Unique element is on the left (including mid)
                right = mid;
            }
        }

        return nums[left];

    }

    public static void main(String[] args) {

    }
}
