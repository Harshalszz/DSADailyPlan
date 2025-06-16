package ProblemsDay_10;

import java.util.Arrays;

public class PermutationinString {
//https://leetcode.com/problems/permutation-in-string/description/
    public static boolean isPermutationinString(String s1, String s2){
        if(s2.length() < s1.length()){
            return false;
        }

        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];

        for(int i =0; i<s1.length() ; i++){
            s1Freq[s1.charAt(i) - 'a']++;
            s2Freq[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(s1Freq, s2Freq)){ //comparing the two frequency arrays are equal or not
            return true;
        }

        int i = 0 , j = s1.length(); // i start from start and j starts from length of p string

        while(j<s2.length()){
            //move the window
            s2Freq[s2.charAt(i++)-'a']--; //from sfrequnecy array will remove/decremt the count of the i character
            s2Freq[s2.charAt(j++)-'a']++; // from sfreqeuncy array will add/increement  the count of niew character

            if(Arrays.equals(s1Freq, s2Freq)){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        System.out.println(isPermutationinString(s1,s2));

    }
}
