package ProblemsDay_178;

import java.util.ArrayList;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
//https://leetcode.com/problems/find-target-indices-after-sorting-array/?envType=problem-list-v2&envId=binary-search
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        int lesser = 0, equal = 0;

        // Count elements less than and equal to target
        for (int num : nums) {
            if (num < target) lesser++;
            else if (num == target) equal++;
        }

        // The target values will occupy indices:
        // lesser, lesser + 1, ..., lesser + equal - 1
        for (int i = 0; i < equal; i++) {
            ans.add(lesser + i);
        }

        return ans;
    }
    public static void main(String[] args) {

    }
}
