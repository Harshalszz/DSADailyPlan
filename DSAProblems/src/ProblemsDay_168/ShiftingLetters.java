package ProblemsDay_168;

public class ShiftingLetters {
//https://leetcode.com/problems/shifting-letters/?envType=problem-list-v2&envId=array

    public String shiftingLetters(String s, int[] shifts) {
        long sum = 0;
        char[] res = s.toCharArray();

        // Traverse from end to start and apply cumulative shifts
        for (int i = s.length() - 1; i >= 0; i--) {
            sum += shifts[i];
            int charVal = res[i] - 'a';
            charVal = (int) ((charVal + sum) % 26);
            res[i] = (char) ('a' + charVal);
        }
        return new String(res);
    }
    public static void main(String[] args) {

    }
}
