package ProblemsDay_91;

public class SmallestNumberWithAllSetBits {

    //https://leetcode.com/problems/smallest-number-with-all-set-bits/

    public int smallestNumber(int n) {

        // int res = 1;

        // while(res < n){
        //     res = res*2 + 1;
        // }

        // return res;

        int res = n;

        while((res & (res +1) )!=0){//checking if all bits are set bits

            res++;
        }

        return res;

    }

    public static void main(String[] args) {

    }
}
