package ProblemsDay_127;

public class FindtheDifference {

    //https://leetcode.com/problems/find-the-difference/?envType=problem-list-v2&envId=sorting

    public char findTheDifference(String s, String t) {
        // HashMap<Character, Integer> res = new HashMap<>();

        // for(int i=0; i<s.length(); i++){
        //     char c1 = s.charAt(i);

        //     res.put(c1, res.getOrDefault(c1, 0) + 1);
        // }

        // for(int i=0; i<t.length(); i++){
        //     char c2 = t.charAt(i);

        //     if(!res.containsKey(c2)){
        //         return c2;
        //     } else {
        //         res.put(c2, res.get(c2) - 1);
        //         if(res.get(c2) == 0){
        //             res.remove(c2);
        //         }
        //     }
        // }
        // return ' ';

        // Step 1: Frequency array
        int[] freq = new int[26];

        // Step 2: Count characters of 's'
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Step 3: Subtract counts using 't'
        for (int i = 0; i < t.length(); i++) {
            int idx = t.charAt(i) - 'a';
            freq[idx]--;
            if (freq[idx] < 0) {   // means this character is the extra one
                return t.charAt(i);
            }
        }

        return ' ';
    }

    public static void main(String[] args) {

    }
}
