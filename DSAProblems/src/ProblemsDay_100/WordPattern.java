package ProblemsDay_100;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    //https://leetcode.com/problems/word-pattern/?envType=study-plan-v2&envId=top-interview-150

    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if(pattern.length() != words.length){
            return false;
        }

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for(int i=0; i<pattern.length(); i++){

            char ch = pattern.charAt(i);
            String word = words[i];

            if(charToWord.containsKey(ch)){
                if(!charToWord.get(ch).equals(word)){
                    return false;
                }
            }else{
                if (wordToChar.containsKey(word)) {
                    return false; // This word is already mapped to another character
                }
                charToWord.put(ch, word);
                wordToChar.put(word, ch);
            }
        }

        return true;

    }

    public static void main(String[] args) {

    }
}
