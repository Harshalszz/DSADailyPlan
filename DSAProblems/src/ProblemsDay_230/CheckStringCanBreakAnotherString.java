package ProblemsDay_230;

import java.util.Arrays;

public class CheckStringCanBreakAnotherString {
//https://leetcode.com/problems/check-if-a-string-can-break-another-string/?envType=problem-list-v2&envId=string
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        boolean aBreak = true;
        boolean bBreak = true;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < b[i]) {
                aBreak = false;
            }
            if (a[i] > b[i]) {
                bBreak = false;
            }
        }
        return aBreak || bBreak;
    }
    public static void main(String[] args) {

    }
}
