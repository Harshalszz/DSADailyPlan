package ProblemsDay_193;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {
//https://leetcode.com/problems/most-common-word/?envType=problem-list-v2&envId=string
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase();
        String para[] = paragraph.split("\\s+");
        String res = "";
        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for(String b : banned){
            set.add(b);
        }
        for(String s : para){
            if(!set.contains(s)){
                map.put(s, map.getOrDefault(s,0)+1);
            }
        }
        int max = 0;
        for(String k : map.keySet()){
            if(map.get(k) > max){
                max = map.get(k);
                res = k;
            }
        }
        //System.out.print(map);
        return res;
    }

    public static void main(String[] args) {

    }
}
