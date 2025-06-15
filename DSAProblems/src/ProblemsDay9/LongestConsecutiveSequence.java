package ProblemsDay9;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
//https://leetcode.com/problems/longest-consecutive-sequence/description/
    public static int longestConsecutiveSequence(int nums[]){
        Set<Integer> numSet = new HashSet<>();

        int res = 0;

        for(int n :nums){
            numSet.add(n);
        }

        for (int n : numSet){
            if(!numSet.contains(n-1)){
                int len = 1;

                while(numSet.contains(n + len)){
                    len++;
                }

                res = Math.max(res,len);
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutiveSequence(nums));

    }
}
