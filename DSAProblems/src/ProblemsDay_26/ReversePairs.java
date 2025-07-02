package ProblemsDay_26;

public class ReversePairs {
    static int ans = 0;



    // Recursive merge sort on the subarray nums[l...r)
    public static void mergeSort(int l, int r, int[] nums) {
        // Base case: if the subarray has 0 or 1 element, it's already sorted
        if (r - l <= 1)
            return;

        int m = l + (r - l) / 2;

        // Sort the left and right halves
        mergeSort(l, m, nums);
        mergeSort(m, r, nums);

        // Count reverse pairs:
        // We count how many j's in right half such that nums[i] > 2 * nums[j]
        int j = m;
        for (int i = l; i < m; i++) {
            // Move pointer j until the condition fails
            while (j < r && (long) nums[i] > 2L * (long) nums[j]) j++;
            ans += (j - m); // All such j's form reverse pairs with i
        }

        // Now merge the two sorted halves
        merge(l, m, r, nums);
    }

    // Standard merge step in merge sort: merge sorted arrays nums[l...m) and nums[m...r)
    public static void merge(int l, int m, int r, int[] nums) {
        int sz = r - l;
        int[] temp = new int[sz]; // Temporary array to hold merged result
        int c = 0;
        int p1 = l, p2 = m;

        // Merge the two sorted halves into temp
        while (p1 < m && p2 < r) {
            if (nums[p1] < nums[p2]) {
                temp[c++] = nums[p1++];
            } else {
                temp[c++] = nums[p2++];
            }
        }

        // Copy remaining elements from the left half, if any
        while (p1 < m)
            temp[c++] = nums[p1++];

        // Copy remaining elements from the right half, if any
        while (p2 < r)
            temp[c++] = nums[p2++];

        // Copy the merged elements back into the original array
        for (int i = l; i < r; i++) {
            nums[i] = temp[i - l];
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,3,2,3,1};
        int l = 0, r = nums.length;
        // Apply modified merge sort
        //System.out.println(mergeSort(l, r, nums));

    }
}
