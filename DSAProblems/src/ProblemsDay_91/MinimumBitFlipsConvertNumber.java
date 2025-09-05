package ProblemsDay_91;

public class MinimumBitFlipsConvertNumber {
    //https://leetcode.com/problems/minimum-bit-flips-to-convert-number/

    public int minBitFlips(int start, int goal) {

        int flips = 0;

        while(start > 0|| goal>0){
            int bitS = start&1; // accessing teh right most bit
            int bitG = goal&1;

            if(bitS != bitG){
                flips++;
            }

            start >>=1;
            goal >>=1; // rightshifting the bits
        }

        return flips;

    }

    public static void main(String[] args) {

    }
}
