package ProblemsDay_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindResultantArrayAfterRemovingAnagrams {

    public List<String> removeAnagrams(String[] words) {

        List<String> res = new ArrayList<>();

        int[] prevCharArray = new int[26];

        for(String str : words){

            int[] currCharArray = new int[26];

            for(char ch : str.toCharArray()){
                currCharArray[ch-'a']++;
            }

            if(!Arrays.equals(prevCharArray,currCharArray)){
                res.add(str);
                prevCharArray = currCharArray;
            }
        }

        return res;

    }

    public static void main(String[] args) {



    }
}
