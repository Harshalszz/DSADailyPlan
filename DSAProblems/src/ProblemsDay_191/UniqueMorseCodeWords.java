package ProblemsDay_191;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {

//https://leetcode.com/problems/unique-morse-code-words/?envType=problem-list-v2&envId=string
    public int uniqueMorseRepresentations(String[] words) {
        String[] code = {
                ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--",
                "-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };

        Set<String> set = new HashSet<>();

        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(code[c - 'a']);
            }
            set.add(sb.toString());
        }

        return set.size();
    }
    public static void main(String[] args) {

    }
}
