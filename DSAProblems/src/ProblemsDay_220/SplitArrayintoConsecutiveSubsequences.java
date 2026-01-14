package ProblemsDay_220;

import java.util.HashMap;
import java.util.Map;

public class SplitArrayintoConsecutiveSubsequences {

    //https://leetcode.com/problems/split-array-into-consecutive-subsequences/?envType=problem-list-v2&envId=array
    public boolean isPossible(int[] nums) {
        // freq: counts how many of each number are available to be used
        Map<Integer, Integer> freq = new HashMap<>();
        // want: counts how many sequences are currently ending at (x-1) and need 'x'
        Map<Integer, Integer> want = new HashMap<>();

        for (int i : nums) freq.put(i, freq.getOrDefault(i, 0) + 1);

        for (int i : nums) {
            if (freq.get(i) == 0) continue; // Already consumed by a previous 'new sequence' check

            // Option 1: Try to extend an existing sequence
            if (want.getOrDefault(i, 0) > 0) {
                freq.put(i, freq.get(i) - 1);
                want.put(i, want.get(i) - 1);
                want.put(i + 1, want.getOrDefault(i + 1, 0) + 1);
            }
            // Option 2: Try to create a new sequence of length 3
            else if (freq.getOrDefault(i + 1, 0) > 0 && freq.getOrDefault(i + 2, 0) > 0) {
                freq.put(i, freq.get(i) - 1);
                freq.put(i + 1, freq.get(i + 1) - 1);
                freq.put(i + 2, freq.get(i + 2) - 1);
                // This sequence now ends at i+2, so it looks forward to i+3
                want.put(i + 3, want.getOrDefault(i + 3, 0) + 1);
            }
            // Option 3: Impossible to use 'i' validly
            else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
