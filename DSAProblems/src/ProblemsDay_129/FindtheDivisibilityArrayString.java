package ProblemsDay_129;

public class FindtheDivisibilityArrayString {

//https://leetcode.com/problems/find-the-divisibility-array-of-a-string/
    public int[] divisibilityArray(String word, int m) {
        char[] ch = word.toCharArray();
        int[] ans = new int[ch.length];
        long val = 0;
        for(int i = 0; i < ch.length; i++){
            int n = ch[i] - 48;
            val = val * 10 + n;
            if(val % m == 0){
                ans[i] = 1;
            }
            else{
                ans[i] = 0;
            }
            val = val % m;
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
