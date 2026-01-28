package ProblemsDay_234;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    //https://leetcode.com/problems/longest-substring-without-repeating-characters/
    public int lengthOfLongestSubstring(String s) {

        int left = 0, maxLen = 0;

        HashSet<Character> charset = new HashSet<>();

        for(int right =0; right <s.length(); right++){

            while(charset.contains(s.charAt(right))){
                charset.remove(s.charAt(left));
                left++;
            }

            charset.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left +1);
        }

        return maxLen;
    }
    public static void main(String[] args) {

    }
}
