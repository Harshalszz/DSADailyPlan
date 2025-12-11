package ProblemsDay_186;

import java.util.HashMap;
import java.util.Map;

public class LongestUncommonSubsequenceII {
//https://leetcode.com/problems/longest-uncommon-subsequence-ii/?envType=problem-list-v2&envId=string
    private boolean isNotSubSequence(String s, String[] strs){
        for(String t : strs){
            if(s.equals(t)){
                continue;
            }
            if(isSubsequence(s, t)){
                return false;
            }
        }
        return true;
    }

    private boolean isSubsequence(String a, String b){
        int i = 0;
        int j = 0;
        while(i < a.length() && j < b.length()){
            if(a.charAt(i) == b.charAt(j)){
                i++;
            }
            j++;
        }
        return i == a.length();
    }

    public int findLUSlength(String[] strs) {
        Map<String, Integer> map = new HashMap<>();

        for(String s : strs){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int max = -1;
        for(String s : strs){
            if(map.get(s) == 1 && s.length() > max && isNotSubSequence(s, strs)){
                max = s.length();
            }
        }
        return max;
    }
    public static void main(String[] args) {

    }
}
