package ProblemsDay_244;

public class ChangeMinimumCharactersSatisfyOneThreeConditions {

    //https://leetcode.com/problems/change-minimum-characters-to-satisfy-one-of-three-conditions/?envType=problem-list-v2&envId=string
    public int minCharacters(String a, String b) {
        int R = 'z' - 'a' + 1;
        int[] A = new int[R];
        int[] B = new int[R];
        for (int i = 0; i < a.length(); i++) A[a.charAt(i)-'a']++;
        for (int i = 0; i < b.length(); i++) B[b.charAt(i)-'a']++;

        int result = a.length() + b.length();
        for (int i = 0, at = 0, bt = 0; i < R; i++) {
            at += A[i];
            bt += B[i];
            if (i < R-1) result = Math.min(result, a.length()-at + bt);
            if (i < R-1) result = Math.min(result, at + b.length()-bt);
            result = Math.min(result, a.length()+b.length()-A[i]-B[i]);
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
