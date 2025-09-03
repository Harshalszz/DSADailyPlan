package ProblemsDay_89;

public class MaximizeNumberofSubsequencesString {
    //https://leetcode.com/problems/maximize-number-of-subsequences-in-a-string/
    public long maximumSubsequenceCount(String text, String pattern) {

        long way1 = 0;
        int wayP0 = 1;

        for(int i=0; i<text.length(); i++){
            if(text.charAt(i) == pattern.charAt(1)){
                way1 += wayP0;
            }
            if(text.charAt(i) == pattern.charAt(0)){
                wayP0++;
            }
        }

        long way2 =0 ;
        int wayP1 = 1;

        for(int i = text.length()-1 ; i>=0; i--){
            if(text.charAt(i) == pattern.charAt(0)){
                way2 += wayP1;
            }
            if(text.charAt(i) == pattern.charAt(1)){
                wayP1++;
            }
        }

        return Math.max(way1, way2);

    }

    public static void main(String[] args) {

    }
}
