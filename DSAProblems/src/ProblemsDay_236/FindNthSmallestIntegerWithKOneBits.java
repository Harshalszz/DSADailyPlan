package ProblemsDay_236;

public class FindNthSmallestIntegerWithKOneBits {

    //https://leetcode.com/problems/find-nth-smallest-integer-with-k-one-bits/
    Long dp[][];
    public long nthSmallest(long n, int k) {
        dp = new Long[50][51];

        long ans = 0; int onesLeft = k;
        for(int bit = 49; bit >= 0; bit--){
            if(onesLeft == 0) break;

            long count = helper(bit - 1, onesLeft);

            if(count < n){
                n -= count;
                ans |= (1L << bit);
                onesLeft--;
            }
        }
        return ans;
    }

    public long helper(int pos, int ones){
        if(ones < 0) return 0;
        if(ones == 0) return 1;
        if(pos < 0) return 0;
        if(dp[pos][ones] != null) return dp[pos][ones];

        // Take this bit
        long take = helper(pos - 1, ones - 1);

        // Leave this bit
        long leave = helper(pos - 1, ones);

        return dp[pos][ones] = take + leave;
    }
    public static void main(String[] args) {

    }
}
