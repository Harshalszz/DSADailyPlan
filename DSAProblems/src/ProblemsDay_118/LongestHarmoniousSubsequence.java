package ProblemsDay_118;

import java.util.HashMap;

public class LongestHarmoniousSubsequence {


    //https://leetcode.com/problems/longest-harmonious-subsequence/?envType=problem-list-v2&envId=sliding-window
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int res = 0;
        for(int num : freq.keySet()) {
            if(freq.containsKey(num + 1))
                res = Math.max(res, freq.get(num) + freq.get(num + 1));
        }

        return res;
    }

    public static void main(String[] args) {

    }
}
