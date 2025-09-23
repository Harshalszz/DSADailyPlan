package ProblemsDay_109;

public class PlusOne {
    //https://leetcode.com/problems/plus-one/?envType=study-plan-v2&envId=top-interview-150

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {

    }
}
