package ProblemsDay8;

import java.util.*;

public class GroupAnagrams {
//https://leetcode.com/problems/group-anagrams/description/
    public static List<List<String>> groupAnagrams(String[] strs){

        // HashMap<HashMap<Character, Integer>, ArrayList<String>> bmap = new HashMap<>();

        // for (String str : strs) {
        //     HashMap<Character, Integer> fmap = new HashMap<>();
        //     for (int i = 0; i < str.length(); i++) {
        //         char ch = str.charAt(i);
        //         fmap.put(ch, fmap.getOrDefault(ch, 0) + 1);
        //     }

        //     if (!bmap.containsKey(fmap)) {
        //         ArrayList<String> list = new ArrayList<>();
        //         list.add(str);
        //         bmap.put(fmap, list);
        //     } else {
        //         ArrayList<String> list = bmap.get(fmap);
        //         list.add(str);
        //     }
        // }

        // List<List<String>> res = new ArrayList<>();
        // for (ArrayList<String> val : bmap.values()) {
        //     res.add(val);
        // }

        // return res;

        Map<String, List<String>> ans = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];

            // Count frequency of each letter in the string
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int num : count) {
                sb.append(num).append("#");
            }
            String key = sb.toString();
            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s);
        }

        return new ArrayList<>(ans.values());

    }
    public static void main(String[] args) {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagrams(strs));

    }
}

