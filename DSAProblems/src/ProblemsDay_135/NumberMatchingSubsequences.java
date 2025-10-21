package ProblemsDay_135;

import java.util.*;

public class NumberMatchingSubsequences {

    //https://leetcode.com/problems/number-of-matching-subsequences/?envType=problem-list-v2&envId=binary-search
    public int numMatchingSubseq(String s, String[] words) {
        Map<Character, List<Integer>> charIndexMap = new HashMap<>();

        // Step 1: Store all positions of each character in 's'
        for (int i = 0; i < s.length(); i++) {
            charIndexMap
                    .computeIfAbsent(s.charAt(i), c -> new ArrayList<>())
                    .add(i);
        }

        int count = 0;

        // Step 2: Check if each word is a subsequence
        for (String word : words) {
            if (isSubsequence(word, charIndexMap)) {
                count++;
            }
        }

        return count;
    }

    private boolean isSubsequence(String word, Map<Character, List<Integer>> map) {
        int prevIndex = -1;

        for (char c : word.toCharArray()) {
            if (!map.containsKey(c)) return false;

            List<Integer> indices = map.get(c);

            // Use binary search to find the smallest index > prevIndex
            int pos = Collections.binarySearch(indices, prevIndex + 1);
            if (pos < 0) {
                pos = -pos - 1;
            }

            if (pos == indices.size()) return false;

            prevIndex = indices.get(pos);
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
