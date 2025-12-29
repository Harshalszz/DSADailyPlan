package ProblemsDay_204;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GroupsofSpecialEquivalentStrings {
//https://leetcode.com/problems/groups-of-special-equivalent-strings/?envType=problem-list-v2&envId=string
    public int numSpecialEquivGroups(String[] words) {
        Set<String> set = new HashSet<>();
        for (String s : words) {
            set.add(normalize(s));
        }
        return set.size();
    }

    private String normalize(String s) {
        int n = s.length();
        char[] evenChars = new char[n % 2 == 0 ? (n / 2) : (n / 2 + 1)];
        char[] oddChars = new char[n / 2];
        int even = 0;
        int odd = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenChars[even] = s.charAt(i);
                even++;
            } else {
                oddChars[odd] = s.charAt(i);
                odd++;
            }
        }
        Arrays.sort(evenChars);
        Arrays.sort(oddChars);
        StringBuilder sb = new StringBuilder(n);
        sb.append(evenChars);
        sb.append(oddChars);
        return sb.toString();
    }
    public static void main(String[] args) {

    }
}
