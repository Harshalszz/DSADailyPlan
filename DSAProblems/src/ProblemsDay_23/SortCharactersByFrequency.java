package ProblemsDay_23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency {
//https://leetcode.com/problems/sort-characters-by-frequency/
    public static String sortCharactersByFrequency(String s){
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        List<List<Character>> buckets = new ArrayList<>();
        for (int i = 0; i <= s.length(); i++) {
            buckets.add(new ArrayList<>());
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            int freq = entry.getValue();
            char c = entry.getKey();
            buckets.get(freq).add(c);
        }

        StringBuilder res = new StringBuilder();
        for (int i = buckets.size() - 1; i > 0; i--) {
            for (char c : buckets.get(i)) {
                for (int j = 0; j < i; j++) {
                    res.append(c);
                }
            }
        }

        return res.toString();

    }

    public static void main(String[] args) {

        String s = "eleven";

        System.out.println(sortCharactersByFrequency(s));

    }
}
