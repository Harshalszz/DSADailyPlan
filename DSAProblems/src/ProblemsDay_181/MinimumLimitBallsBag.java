package ProblemsDay_181;

import java.util.Arrays;

public class MinimumLimitBallsBag {
//https://leetcode.com/problems/minimum-limit-of-balls-in-a-bag/?envType=problem-list-v2&envId=binary-search
    public int minimumSize(int[] nums, int maxOperations) {
        int l = 1;
        int h = Arrays.stream(nums).max().getAsInt(); // max bag size
        while(l < h) {
            int mid = l + (h - l) / 2;                // mid of size
            int c = 0;
            for(int x : nums)
                c += (x - 1) / mid;                  // count no of operations
            if(c > maxOperations)                     // if size is small, large no of operations
                l = mid + 1;                          // neglect range of small size
            else
                h = mid;                              // set higher bound to mid to obtain optimal solution
        }
        return l;
    }
    public static void main(String[] args) {

    }
}
