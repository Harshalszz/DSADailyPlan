package ProblemsDay6;

import java.util.Arrays;

public class CountingBits {
//https://leetcode.com/problems/counting-bits/description/
    public static int[] countingBits(int n){
        int[] res = new int[n+1];

        res[0] = 0;
        // x/2 = 0 y/2 = 1
        for(int i=0; i<=n;i++){
            res[i] = res[i/2] + i%2;
        }

        return res;
    }

    public static void main(String[] args) {

        int n =5;
        System.out.println(Arrays.toString(countingBits(n)));

    }
}
