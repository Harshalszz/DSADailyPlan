package ProblemsDay_23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentWords {
//https://leetcode.com/problems/top-k-frequent-words/description/
    public static List<String> topKFrequentWords(String[] words, int k){

        HashMap<String,Integer> freq=new HashMap<>();
        for(int i=0;i<words.length;i++)
        {
            freq.put(words[i],freq.getOrDefault(words[i],0)+1);
        }
        List<String> res = new ArrayList(freq.keySet());
        //sorting
        //if two words have the same frequency, then the word with the lower alphabetical order comes first.
        //else most frequent words will come first
        Collections.sort(res, (w1, w2) -> freq.get(w1).equals(freq.get(w2)) ?
                w1.compareTo(w2) : freq.get(w2) - freq.get(w1));

        return res.subList(0, k);

    }

    public static void main(String[] args) {

        String[] words = {"i","love","leetcode","i","love","coding"};

        System.out.println(topKFrequentWords(words, 2));

    }
}
