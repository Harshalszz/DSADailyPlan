package ProblemsDay_157;

import java.util.Arrays;

public class BuddyStrings {

    //https://leetcode.com/problems/buddy-strings/
    public boolean buddyStrings(String s, String goal) {
        int n = s.length();
        if (n != goal.length() || n == 1)
            return false;
        int a, b, i = 0, arr[] = new int[26];
        Arrays.fill(arr, 0);
        while (i < n && s.charAt(i) == goal.charAt(i)) {
            arr[s.charAt(i) - 'a']++;
            i++;
        }
        if (i == n) {
            for (int j = 0; j < 26; j++)
                if (arr[j] >= 2)
                    return true;
            return false;
        }
        a = i++;
        while (i < n && s.charAt(i) == goal.charAt(i))
            i++;
        if (i == n)
            return false;
        b = i++;
        while (i < n && s.charAt(i) == goal.charAt(i))
            i++;
        if (i != n)
            return false;
        return goal.charAt(b) == s.charAt(a) && goal.charAt(a) == s.charAt(b);
    }
    public static void main(String[] args) {

    }
}
