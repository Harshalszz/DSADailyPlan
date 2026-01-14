package ProblemsDay_220;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumLengthofPairChain {

    //https://leetcode.com/problems/maximum-length-of-pair-chain/?envType=problem-list-v2&envId=array
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[1]));

        int[] prev = pairs[0];
        int res = 1;

        for (int i = 1; i < pairs.length; i++) {
            int[] cur = pairs[i];
            if (cur[0] > prev[1]) {
                res++;
                prev = cur;
            }
        }

        return res;
    }
    public static void main(String[] args) {

    }
}
