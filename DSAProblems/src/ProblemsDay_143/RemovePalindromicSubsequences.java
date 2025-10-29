package ProblemsDay_143;

public class RemovePalindromicSubsequences {

    //https://leetcode.com/problems/remove-palindromic-subsequences/?envType=problem-list-v2&envId=two-pointers
    public int removePalindromeSub(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return 2;
            left++;
            right--;
        }
        return 1;
    }
    public static void main(String[] args) {

    }
}
