package ProblemsDay_174;

import java.util.Arrays;

public class OptimalPartitionString {
//https://leetcode.com/problems/optimal-partition-of-string/
    public int partitionString(String s) {
        int n = s.length();
        int[] lastSeen = new int[26];
        int res = 0;
        int curr = 0;


        Arrays.fill(lastSeen, -1);

        for( int i = 0; i < n; i++ ) {
            char ch = s.charAt(i);

            if( lastSeen[ch - 'a'] >= curr ) {
                res += 1;
                curr = i;
            }
            lastSeen[ch - 'a'] = i;

        }

        return res + 1;

    }
    public static void main(String[] args) {

    }
}
