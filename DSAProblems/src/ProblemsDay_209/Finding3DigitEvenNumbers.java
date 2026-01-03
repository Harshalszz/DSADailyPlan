package ProblemsDay_209;

import java.util.ArrayList;
import java.util.Arrays;

public class Finding3DigitEvenNumbers {

//https://leetcode.com/problems/finding-3-digit-even-numbers/?envType=problem-list-v2&envId=recursion
    public int[] findEvenNumbers(int[] digits) {

        int[] freq = new int[10];
        for(int x:digits){
            freq[x]++;
        }
        ArrayList<Integer> res = new ArrayList<>();

        helper(res,freq,0,0);

        int[] ans = new int[res.size()];
        int idx = 0;
        for(int x : res){
            ans[idx++] = x;
        }
        Arrays.sort(ans);
        return ans;
    }

    void helper(ArrayList<Integer> res,int[] freq, int pos, int num){
        if(pos == 3){
            if(num%2 == 0){
                res.add(num);
            }
            return;
        }
        for(int d=0;d<10;d++){
            if(freq[d] == 0) continue;
            if(pos == 0 && d == 0) continue;
            if(pos == 2 && d%2 == 1) continue;

            freq[d]--;
            helper(res,freq,pos+1,num*10 + d);
            freq[d]++;
        }
    }
    public static void main(String[] args) {

    }
}
