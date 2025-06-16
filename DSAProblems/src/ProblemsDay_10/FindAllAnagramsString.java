package ProblemsDay_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsString {
//https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
    public static List<Integer> findAllAnagramsString(String s, String p){
        //s = "cbaebabacd", p = "abc"

        List<Integer> res = new ArrayList<>();

        if(p.length() > s.length()){
            return res;
        }

        int[] sFreq = new int[26];
        int[] pFreq = new int[26];

        for(int i =0; i<p.length() ; i++){
            sFreq[s.charAt(i) - 'a']++;
            pFreq[p.charAt(i) - 'a']++;
        }

        if(Arrays.equals(pFreq, sFreq)){ //comparing the two frequency arrays are equal or not
            res.add(0);
        }

        int i = 0 , j = p.length(); // i start from start and j starts from length of p string

        while(j<s.length()){
            //move the window
            sFreq[s.charAt(i++)-'a']--; //from sfrequnecy array will remove/decremt the count of the i character
            sFreq[s.charAt(j++)-'a']++; // from sfreqeuncy array will add/increement  the count of niew character

            if(Arrays.equals(pFreq, sFreq)){
                res.add(i);
            }
        }

        return res;
    }

    public static void main(String[] args) {

        String s= "cbaebabacd";
        String p = "abc";

        System.out.println(findAllAnagramsString(s,p));

    }
}
