package ProblemsDay5;

public class IsSubsequence {
//https://leetcode.com/problems/is-subsequence/
    public static  boolean isSubsequence(String s, String t){
        int pS = 0;
        int pT =0;

        while(pS<s.length() && pT <t.length()){
            if(s.charAt(pS) == t.charAt(pT)){
                pS++;
            }
            pT++;
        }

        return pS == s.length();
    }

    public static void main(String[] args) {

        String s = "abc" , t="ahjdbzdrckghgh";
        System.out.println(isSubsequence(s,t));

    }
}
