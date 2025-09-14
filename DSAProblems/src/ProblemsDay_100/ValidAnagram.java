package ProblemsDay_100;

public class ValidAnagram {
    //https://leetcode.com/problems/valid-anagram/?envType=study-plan-v2&envId=top-interview-150

    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        int[] sCharArray = new int[26];

        for(char ch: s.toCharArray()){
            sCharArray[ch-'a']++;
        }

        for(char ch : t.toCharArray()){
            if(sCharArray[ch-'a'] == 0){
                return false;
            }
            sCharArray[ch-'a']--;
        }

        return true;

    }

    public static void main(String[] args) {

    }
}
