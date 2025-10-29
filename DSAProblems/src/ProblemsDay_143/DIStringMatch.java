package ProblemsDay_143;

public class DIStringMatch {

    //https://leetcode.com/problems/di-string-match/?envType=problem-list-v2&envId=two-pointers
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] result = new int[n + 1];
        int low = 0, high = n;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                result[i] = low++;
            } else {
                result[i] = high--;
            }
        }
        result[n] = low; // low == high at the end
        return result;
    }
    public static void main(String[] args) {

    }
}
