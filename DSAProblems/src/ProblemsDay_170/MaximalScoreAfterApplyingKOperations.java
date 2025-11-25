package ProblemsDay_170;

import java.util.PriorityQueue;

public class MaximalScoreAfterApplyingKOperations {
//https://leetcode.com/problems/maximal-score-after-applying-k-operations/
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int num : nums) pq.add(num);
        long res = 0;
        while (k-- > 0) {
            int max = pq.poll();
            res += max;
            pq.add((max + 2) / 3);
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
