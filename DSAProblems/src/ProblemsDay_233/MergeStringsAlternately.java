package ProblemsDay_233;

public class MergeStringsAlternately {

    //https://leetcode.com/problems/merge-strings-alternately/
    public String mergeAlternately(String word1, String word2) {

        int  i =0;
        StringBuilder res = new StringBuilder();

        while(i<word1.length() || i<word2.length()){

            if(i<word1.length()){
                res.append(word1.charAt(i));
            }

            if(i<word2.length()){
                res.append(word2.charAt(i));
            }

            i++;
        }


        return res.toString();

    }
    public static void main(String[] args) {

    }
}
