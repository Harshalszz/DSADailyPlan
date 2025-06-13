package ProblemsDay7;

import java.util.HashMap;

public class IsomorphicStrings {
//https://leetcode.com/problems/isomorphic-strings/description/
    public static boolean isomorphicStrings(String s, String t){
        HashMap<Character, Integer> charIndexS = new HashMap<>();
        HashMap<Character, Integer> charIndexT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!charIndexS.containsKey(s.charAt(i))) {
                charIndexS.put(s.charAt(i), i);
            }

            if (!charIndexT.containsKey(t.charAt(i))) {
                charIndexT.put(t.charAt(i), i);
            }

            if (!charIndexS.get(s.charAt(i)).equals(charIndexT.get(t.charAt(i)))) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "egg";
        String t ="add";

        System.out.println(isomorphicStrings(s,t));
    }
}
