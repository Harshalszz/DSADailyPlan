package ProblemsDay_133;

import java.util.Arrays;

public class MaximumBinaryStringAfterChange {

    //https://leetcode.com/problems/maximum-binary-string-after-change/

    public String maximumBinaryString(String binary) {
        int n = binary.length();
        char[] chars = binary.toCharArray();
        int firstZero = -1;
        int shift = 0;
        for(int i = 0; i < n; i++){
            if(chars[i] == '0'){
                if(firstZero == -1){
                    firstZero = i;
                }else shift++;
            }

        }
        if(firstZero == -1){
            return binary;
        }
        char[] ans = new char[n];
        Arrays.fill(ans, '1');
        ans[firstZero + shift] = '0';
        return  new String(ans);
    }
    public static void main(String[] args) {

    }
}
