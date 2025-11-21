package ProblemsDay_166;

import java.util.*;

public class RewardTopKStudents {

//    /https://leetcode.com/problems/reward-top-k-students/
    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        int n = student_id.length;
        Set<String> positive = new HashSet<>();
        Set<String> negative = new HashSet<>();
        for(String p : positive_feedback){
            positive.add(p);
        }
        for(String a : negative_feedback){
            negative.add(a);
        }
        int[][] pairs = new int[n][2];
        for(int i = 0; i < n; i++){
            String arr[] = report[i].split(" ");
            int score = 0;
            for(String word : arr){
                if(positive.contains(word)){
                    score += 3;
                }
                else if(negative.contains(word)){
                    score -=1;
                }
            }
            pairs[i][0] = student_id[i];
            pairs[i][1] = score;
        }


        Arrays.sort(pairs, (a, b) -> {
            if (b[1] != a[1]) {
                return Integer.compare(b[1], a[1]);
            } else {
                return Integer.compare(a[0], b[0]);
            }
        });

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ans.add(pairs[i][0]);
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
