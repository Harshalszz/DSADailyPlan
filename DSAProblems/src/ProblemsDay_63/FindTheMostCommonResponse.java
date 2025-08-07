package ProblemsDay_63;

import java.util.*;

public class FindTheMostCommonResponse {
//https://leetcode.com/problems/find-the-most-common-response/

    public String findCommonResponse(List<List<String>> responses) {
        Map<String, Integer> counts = new HashMap<>();

        String str = "";
        int freq = 0;

        for(List<String> response : responses) {
            Set<String> answers = new HashSet<>();

            for(String answer : response) {
                if(!answers.contains(answer)) {
                    int count = counts.getOrDefault(answer, 0) + 1;

                    counts.put(answer, count);
                    answers.add(answer);

                    if(count > freq || (count == freq && answer.compareTo(str) < 0)) {
                        freq = count;
                        str = answer;
                    }
                }
            }
        }

        return str;
    }

    public static void main(String[] args) {

    }
}
