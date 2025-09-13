package ProblemsDay_99;

public class RansomNote {
    //https://leetcode.com/problems/ransom-note/?envType=study-plan-v2&envId=top-interview-150

    public boolean canConstruct(String ransomNote, String magazine) {

        if(ransomNote.length() > magazine.length()){
            return false;
        }

        int[] charArray = new int[26];

        for(char ch : magazine.toCharArray()){
            charArray[ch-'a']++;
        }

        for(char ch : ransomNote.toCharArray()){
            if(charArray[ch-'a'] == 0) {
                return false;
            }
            charArray[ch-'a']--;
        }

        return true;

    }

    public static void main(String[] args) {

    }
}
