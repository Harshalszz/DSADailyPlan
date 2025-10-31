package ProblemsDay_145;

public class FindFirstPalindromicStringArray
{

    //https://leetcode.com/problems/find-first-palindromic-string-in-the-array/?envType=problem-list-v2&envId=two-pointers
    public String firstPalindrome(String[] words) {
        for (String s : words) {
            if (check(s)) {
                return s;
            }
        }
        return "";
    }

    boolean check(String c) {
        int i = 0, j = c.length() - 1;
        while (i < j) {
            if (c.charAt(i++) != c.charAt(j--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
