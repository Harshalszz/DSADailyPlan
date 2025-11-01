package ProblemsDay_146;

import java.util.ArrayList;
import java.util.List;

public class FindAllKDistantIndicesArray {

    //https://leetcode.com/problems/find-all-k-distant-indices-in-an-array/?envType=problem-list-v2&envId=two-pointers
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        int[] diff = new int[n + 1];
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] == key) {
                int start = Math.max(0, i - k);
                int end = Math.min(n, i + k + 1);
                diff[start]++;
                if (end < n) diff[end]--;
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += diff[i];
            if (sum > 0) result.add(i);
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
