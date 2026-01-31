package ProblemsDay_237;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    //https://leetcode.com/problems/group-anagrams/

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for(String s : strs){
            int[] count = new int[26];

            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }

            StringBuilder sb =  new StringBuilder();

            for(int num : count){
                sb.append(num).append("#");
            }

            String key = sb.toString();

            if(!res.containsKey(key)){
                res.put(key, new ArrayList<>());
            }

            res.get(key).add(s);
        }

        return new ArrayList<>(res.values());
    }
    public static void main(String[] args) {

    }
}
