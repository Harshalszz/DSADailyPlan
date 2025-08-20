package ProblemsDay_75;

import java.util.*;

public class DetermineifTwoStringsAreClose {
    //https://leetcode.com/problems/determine-if-two-strings-are-close/?envType=study-plan-v2&envId=leetcode-75

    public boolean closeStrings(String word1, String word2) {

        if(word1.length() != word2.length()){
            return false;
        }

        Map<Character, Integer> word1Map = new HashMap<>();

        Map<Character, Integer> word2Map = new HashMap<>();

        for(char c : word1.toCharArray()){
            word1Map.put(c , word1Map.getOrDefault(c,0)+1);
        }

        for(char c : word2.toCharArray()){
            word2Map.put(c , word2Map.getOrDefault(c,0)+1);
        }

        // Check if both words use the same characters
        if (!word1Map.keySet().equals(word2Map.keySet())) {
            return false;
        }

        // int word1Sum =0, word2Sum=0;

        // for(int n : word1Map.values()){
        //     word1Sum +=n;
        // }

        // for(int n : word2Map.values()){
        //     word2Sum +=n;
        // }


        // return word1Sum == word2Sum;

        // Check if the frequencies of characters match (regardless of character)
        List<Integer> freq1 = new ArrayList<>(word1Map.values());
        List<Integer> freq2 = new ArrayList<>(word2Map.values());

        Collections.sort(freq1);
        Collections.sort(freq2);

        return freq1.equals(freq2);

    }

    public static void main(String[] args) {

    }
}
