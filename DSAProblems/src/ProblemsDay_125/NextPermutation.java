package ProblemsDay_125;

public class NextPermutation {

    //https://leetcode.com/problems/next-permutation/?envType=problem-list-v2&envId=two-pointers

    public void nextPermutation(int[] nums) {

        int n = nums.length, pivot = -1;

        // Step 1: Find pivot
        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                pivot = i - 1;
                break;
            }
        }

        // Step 2: Swap pivot with smallest number bigger than it on the right
        if (pivot != -1) {
            for (int i = n - 1; i > pivot; i--) {
                if (nums[pivot] < nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[pivot];
                    nums[pivot] = temp;
                    break;
                }
            }
        }

        // Step 3: Reverse the suffix after pivot
        int l = pivot + 1, r = n - 1;
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {

    }
}
