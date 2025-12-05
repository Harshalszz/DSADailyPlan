package ProblemsDay_180;

import java.util.HashMap;

public class CustomSortString {
//https://leetcode.com/problems/custom-sort-string/?envType=problem-list-v2&envId=sorting
    public String customSortString(String order, String s) {
        StringBuilder result = new StringBuilder();
        HashMap<Character, Integer> mp = new HashMap<>();
        for (char c : s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        for (char c : order.toCharArray()) {
            if (mp.containsKey(c)) {
                result.append(String.valueOf(c).repeat(Math.max(0, mp.get(c))));
                mp.remove(c);
            }
        }
        for (char c : mp.keySet()) {
            result.append(String.valueOf(c).repeat(Math.max(0, mp.get(c))));
        }
        return result.toString();
    }
    public static void main(String[] args) {

    }
}
