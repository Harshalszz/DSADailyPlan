package ProblemsDay_89;

public class MakeThreeStringsEqual {

    //https://leetcode.com/problems/make-three-strings-equal/
    public int findMinimumOperations(String s1, String s2, String s3) {

        if(s1.charAt(0) != s2.charAt(0) || s2.charAt(0) != s3.charAt(0) || s1.charAt(0) != s3.charAt(0)){
            return -1;
        }

        int res =0 ;

        int minLen = Math.min(s1.length(), Math.min(s2.length(), s3.length()));

        for(int i=0; i<minLen; i++){
            if(s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)){
                res++;
            }else{
                break;
            }
        }

        return res == 0 ? -1 : s1.length() +s2.length() + s3.length() - 3*res;

    }

    public static void main(String[] args) {

    }
}
