package ProblemsDay_221;

public class SplitStringBalancedStrings {
//https://leetcode.com/problems/split-a-string-in-balanced-strings/?envType=problem-list-v2&envId=string
    public int balancedStringSplit(String s) {

        int n = s.length();
        if (n == 0) {
            return 0;
        }
        int l = 0;
        int r = 0;
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'L') {
                l++;
            } else {
                r++;
            }

            if (l == r) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {

    }
}
