package ProblemsDay_197;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWordsfromTwoSentences {
//https://leetcode.com/problems/uncommon-words-from-two-sentences/?envType=problem-list-v2&envId=string
    public String[] uncommonFromSentences(String s1, String s2) {
        // 🎯 Create a map to count word frequencies
        Map<String, Integer> wordCount = new HashMap<>();

        // 📝 Split both sentences into words and count occurrences
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");

        // 🔢 Count words from first sentence
        for (String word : words1) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // 🔢 Count words from second sentence
        for (String word : words2) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // 🎯 Collect words that appear exactly once
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }

        // 📦 Convert to array and return
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {

    }
}
