package ProblemsDay_198;

import java.util.List;

public class LongestWordDictionarythroughDeleting {
//https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/?envType=problem-list-v2&envId=array
    public String findLongestWord(String s, List<String> dictionary) {
        dictionary.sort((a, b) -> {
            if (a.length() != b.length())
                return b.length() - a.length();
            return a.compareTo(b);
        });

        for (String word : dictionary) {
            if (isSubsequence(word, s)) {
                return word;
            }
        }
        return "";
    }

    private boolean isSubsequence(String word, String s) {
        int i = 0, j = 0;
        while (i < word.length() && j < s.length()) {
            if (word.charAt(i) == s.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == word.length();
    }
    public static void main(String[] args) {

    }
}
