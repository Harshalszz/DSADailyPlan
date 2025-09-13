package ProblemsDay_99;

public class FindWordsThatCanBeFormedbyCharacters {

    //https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/

    public int countCharacters(String[] words, String chars) {

        int[] charArray = new int[26];

        for(char ch : chars.toCharArray()){
            charArray[ch-'a']++;
        }
        int res = 0;

        for(String word: words){
            int[] temp = charArray.clone();  // Make a fresh copy for each word
            boolean isGood = true;

            for (char ch : word.toCharArray()) {
                if (temp[ch - 'a'] == 0) {
                    isGood = false;
                    break;
                }
                temp[ch - 'a']--;  // Use up one occurrence of the character
            }

            if (isGood) {
                res += word.length();  // Add the length of the good word
            }
        }

        return res;

    }

    public static void main(String[] args) {

    }
}
