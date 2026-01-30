package ProblemsDay_236;

import java.util.ArrayList;
import java.util.List;

public class RotateNonNegativeElements {

    //https://leetcode.com/problems/rotate-non-negative-elements/
    public int[] rotateElements(int[] nums, int k) {

        List<Integer> list = new ArrayList<>();

        // Step 1: collect non-negative numbers
        for (int i : nums) {
            if (i >= 0) {
                list.add(i);
            }
        }

        int z = list.size();
        if (z == 0) return nums;

        // Step 3
        k = k % z;

        // Step 4: rotate list
        List<Integer> rotated = new ArrayList<>();

        for (int i = k; i < z; i++) {
            rotated.add(list.get(i));
        }
        for (int i = 0; i < k; i++) {
            rotated.add(list.get(i));
        }

        // Step 5: place back
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                nums[i] = rotated.get(index++);
            }
        }

        return nums;
    }
    public static void main(String[] args) {

    }
}
