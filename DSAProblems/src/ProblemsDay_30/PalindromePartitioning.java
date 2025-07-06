package ProblemsDay_30;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
//https://leetcode.com/problems/palindrome-partitioning/description/
    private static void backtracking(List<List<String>> resList, List<String> tempList, String s, int start) {

        if(start == s.length()){
            resList.add(new ArrayList(tempList));

            return;
        }

        for(int i= start+1; i<=s.length(); i++){

            if(isPalindrome(s,start, i-1)){

                tempList.add(s.substring(start,i));

                backtracking(resList,tempList,s,i);

                tempList.remove(tempList.size()-1);
            }
        }
    }

    private static boolean isPalindrome(String s, int start, int i) {

        while(start < i){
            if(s.charAt(start) != s.charAt(i)){
                return false;
            }
            start++;
            i--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "aab";

        List<List<String>> resList = new ArrayList<>();

        backtracking(resList, new ArrayList<>(), s, 0);

        System.out.println(resList);
    }


}
