package ProblemsDay_30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsPhoneNumber {
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
    private static void backtracking(String s, int index, StringBuilder temp, List<String> resList, Map<Character, String> map) {

        if(index == s.length()){

            resList.add(temp.toString());
            return;
        }

        String letters = map.get(s.charAt(index));

        for(char ch : letters.toCharArray()){

            temp.append(ch);

            backtracking(s,index+1, temp, resList,map);

            temp.deleteCharAt(temp.length()-1);
        }
    }

    public static void main(String[] args) {
        String s = "23";

        List<String> resList = new ArrayList<>();

        if (s == null || s.length() == 0) {
            System.out.println(resList);
        }

        Map<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");

        backtracking(s, 0, new StringBuilder(), resList, digitToLetters);

        System.out.println(resList);
    }


}
