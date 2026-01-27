package ProblemsDay_233;

public class ValidAnagram {

    //https://leetcode.com/problems/valid-anagram/
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        int[] character = new int[26];

        for(char ch : s.toCharArray()){
            character[ch-'a']++;
        }

        for(char ch : t.toCharArray()){
            if(character[ch-'a'] == 0){
                return false;
            }
            character[ch-'a']--;
        }

        return true;

    }
    public static void main(String[] args) {

    }
}
