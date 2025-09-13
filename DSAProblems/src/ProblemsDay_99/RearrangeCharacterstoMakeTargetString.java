package ProblemsDay_99;

public class RearrangeCharacterstoMakeTargetString {
    //https://leetcode.com/problems/rearrange-characters-to-make-target-string/

    public int rearrangeCharacters(String s, String target) {

        int[] sCharArray = new int[26];
        int[] targetArray = new int[26];

        for (char ch : s.toCharArray()) {
            sCharArray[ch - 'a']++;
        }

        for (char ch : target.toCharArray()) {
            targetArray[ch - 'a']++;
        }

        int res = Integer.MAX_VALUE;

        for (int i = 0; i < 26; i++) {

            if (targetArray[i] != 0) {
                if (sCharArray[i] < targetArray[i]) {
                    return 0;
                }

                res = Math.min(res, sCharArray[i] / targetArray[i]);

            }

        }

        return res;
    }

    public static void main(String[] args) {

    }
}
