package ProblemsDay_246;

import java.util.*;

public class RankTeamsbyVotes {

    //https://leetcode.com/problems/rank-teams-by-votes/?envType=problem-list-v2&envId=string
    public String rankTeams(String[] votes) {
        // Edge case(NOT COMPULSARY)
        if(votes.length == 1){
            return votes[0];
        }



        // Adding each character to the map
        Map<Character, int[]> map = new HashMap<>();
        int v_len = votes[0].length();
        for (String v : votes) {
            int idx = 0;
            for (char ch : v.toCharArray()) {
                map.putIfAbsent(ch, new int[v_len]);
                map.get(ch)[idx++]++;
            }
        }


        // Custom Comparator Sort
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> {
            for (int i = 0; i < v_len; i++) {
                if (map.get(a)[i] != map.get(b)[i]) {
                    return map.get(b)[i] - map.get(a)[i];
                }
            }
            return a - b;
        });


        StringBuilder sb = new StringBuilder();
        for (char ch : list) {
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args) {

    }
}
