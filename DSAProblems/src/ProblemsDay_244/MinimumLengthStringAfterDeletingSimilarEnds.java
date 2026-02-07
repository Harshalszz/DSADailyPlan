package ProblemsDay_244;

public class MinimumLengthStringAfterDeletingSimilarEnds {

    //https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/?envType=problem-list-v2&envId=string
    public int minimumLength(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right && s.charAt(left) == s.charAt(right)) {
            char current = s.charAt(left);
            while (left <= right && s.charAt(left) == current) {
                left++;
            }
            while (right >= left && s.charAt(right) == current) {
                right--;
            }
        }

        return right - left + 1;
    }
    public static void main(String[] args) {

    }
}
