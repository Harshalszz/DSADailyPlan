package ProblemsDay_188;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ImplementMagicDictionary {
    //https://leetcode.com/problems/implement-magic-dictionary/?envType=problem-list-v2&envId=string
    class MagicDictionary {
        Set<String> originalWords;
        Map<String, Integer> extensions;

        public MagicDictionary() {
            originalWords = new HashSet<>();
            extensions = new HashMap<>();
        }

        public void buildDict(String[] dictionary) {
            for (String word : dictionary) {
                originalWords.add(word);
                char[] str = word.toCharArray();
                int n = str.length;
                for (int i = 0; i < n; i++) {
                    char temp = str[i];
                    str[i] = '*';
                    String key = new String(str);
                    extensions.put(key, extensions.getOrDefault(key, 0) + 1);
                    str[i] = temp;
                }
            }
        }

        public boolean search(String searchWord) {
            char[] str = searchWord.toCharArray();
            int n = str.length;
            for (int i = 0; i < n; i++) {
                char temp = str[i];
                str[i] = '*';
                String key = new String(str);
                if (extensions.containsKey(key)) {
                    // If count >= 2, then there's definitely a different word that maps to this pattern
                    // If count == 1, make sure it's not the same word
                    if (extensions.get(key) >= 2 || !originalWords.contains(searchWord)) {
                        return true;
                    }
                }
                str[i] = temp;
            }
            return false;
        }
    }
}
