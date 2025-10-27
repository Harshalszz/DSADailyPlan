package ProblemsDay_141;

public class CheckIfDigitsAreEqualStringAfterOperationsI {
//https://leetcode.com/problems/check-if-digits-are-equal-in-string-after-operations-i/?envType=problem-list-v2&envId=combinatorics

    public boolean hasSameDigits(String s) {
        int iteration = 0; // Tracks how many layers of reduction have been done
        char[] arr = s.toCharArray();

        // Continue reducing until only two digits remain
        while (arr.length - iteration != 2) {
            // Replace each character with the sum of adjacent digits (mod 10)
            for (int i = 0; i < arr.length - 1 - iteration; i++) {
                arr[i] = (char)(((arr[i] - '0') + (arr[i + 1] - '0')) % 10 + '0');
            }
            iteration++;
        }

        // Return true if the final two digits are equal
        return arr[0] == arr[1];

    }
    public static void main(String[] args) {

    }
}
