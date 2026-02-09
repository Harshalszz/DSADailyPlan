package ProblemsDay_246;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringContainingVowelsEvenCounts {
//https://leetcode.com/problems/find-the-longest-substring-containing-vowels-in-even-counts/?envType=problem-list-v2&envId=string
    public int findTheLongestSubstring(String s) {
        int bitmask = 0;
        int maxLength = 0;
        Map<Integer, Integer> bitmaskFirstOccurrence = new HashMap<>();
        bitmaskFirstOccurrence.put(0, -1);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a') {
                bitmask ^= 1 << 0;
            } else if (ch == 'e') {
                bitmask ^= 1 << 1;
            } else if (ch == 'i') {
                bitmask ^= 1 << 2;
            } else if (ch == 'o') {
                bitmask ^= 1 << 3;
            } else if (ch == 'u') {
                bitmask ^= 1 << 4;
            }

            if (bitmaskFirstOccurrence.containsKey(bitmask)) {
                int length = i - bitmaskFirstOccurrence.get(bitmask);
                maxLength = Math.max(maxLength, length);
            } else {
                bitmaskFirstOccurrence.put(bitmask, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

    }
}
