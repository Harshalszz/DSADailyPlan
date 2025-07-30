package ProblemsDay_54;

public class RepeatedSubstringPattern {
    //https://leetcode.com/problems/repeated-substring-pattern/

    public static boolean repeatedSubstringPattern(String s) {

        String str = s + s;
        String str1 = str.substring(1, str.length() - 1);
        return str1.contains(s);

    }

    public static void main(String[] args) {

    }
}
