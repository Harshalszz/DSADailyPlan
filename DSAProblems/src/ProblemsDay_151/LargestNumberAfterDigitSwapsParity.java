package ProblemsDay_151;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestNumberAfterDigitSwapsParity {

    //https://leetcode.com/problems/largest-number-after-digit-swaps-by-parity/
    public int largestInteger(int num) {
        List<Integer> ls = new ArrayList<>();
        while(num > 0) {
            ls.add(num%10);
            num /= 10;
        }
        Collections.reverse(ls);
        int n = ls.size();
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(ls.get(i) < ls.get(j) && areSame(ls.get(i), ls.get(j))) {
                    int temp = ls.get(i);
                    ls.set(i, ls.get(j));
                    ls.set(j, temp);
                }
            }
        }
        int ans = 0;
        for(int i : ls) {
            ans = (ans*10) + i;
        }
        return ans;
    }
    private boolean areSame(int a, int b) {
        return a%2 == b%2;
    }
    public static void main(String[] args) {

    }
}
