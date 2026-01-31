package ProblemsDay_237;

public class FirstUniqueCharacterString {
//https://leetcode.com/problems/first-unique-character-in-a-string/
    public int firstUniqChar(String s) {

        int[] arr = new int[26];

        for(char ch : s.toCharArray()){
            arr[ch-'a']++;
        }

        for(int i =0 ; i<s.length(); i++){

            if(arr[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }

        return -1;
    }
}
