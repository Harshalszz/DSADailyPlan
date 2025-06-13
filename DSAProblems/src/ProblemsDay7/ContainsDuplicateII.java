package ProblemsDay7;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {
//https://leetcode.com/problems/contains-duplicate-ii/description/
    public static boolean containsDuplicateII(int[] nums, int k){
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                seen.remove(nums[i - k - 1]);
            }

            if (seen.contains(nums[i])) {
                return true;
            }

            seen.add(nums[i]);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,1} ;
        int k = 3;
        System.out.println(containsDuplicateII(nums,k));

    }
}
