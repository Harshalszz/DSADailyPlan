package ProblemsDay_122;

public class RangeSumQueryImmutable {
//https://leetcode.com/problems/range-sum-query-immutable/?envType=problem-list-v2&envId=array
    class NumArray {
        private int[] prefix; // prefix sum array

        public NumArray(int[] nums) {
            int n = nums.length;
            prefix = new int[n + 1];  // prefix[0] = 0
            for (int i = 0; i < n; i++) {
                prefix[i + 1] = prefix[i] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            return prefix[right + 1] - prefix[left];
        }
    }
    public static void main(String[] args) {

    }
}
