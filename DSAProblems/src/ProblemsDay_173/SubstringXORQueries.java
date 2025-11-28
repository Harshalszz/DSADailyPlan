package ProblemsDay_173;

import java.util.HashMap;
import java.util.Map;

public class SubstringXORQueries {

    //https://leetcode.com/problems/substring-xor-queries/
    public int[][] substringXorQueries(String s, int[][] queries) {
        int[][] ans = new int[queries.length][2];
        Map<Integer, int[]> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0') {
                map.putIfAbsent(0, new int[]{i, i});
                continue;  //skip substring starting with '0'
            }
            int value = 0;

            for(int j = i; j <= Math.min(i + 30, s.length() - 1); j++) {
                value = (value << 1) + (s.charAt(j) - '0');
                map.putIfAbsent(value, new int[]{i, j});
            }
        }
        int i = 0;
        for(int[] q: queries ) {
            ans[i++] = map.getOrDefault(q[0] ^ q[1], new int[] {-1, -1});
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
