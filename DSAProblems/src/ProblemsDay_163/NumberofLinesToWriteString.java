package ProblemsDay_163;

public class NumberofLinesToWriteString {

    //https://leetcode.com/problems/number-of-lines-to-write-string/?envType=problem-list-v2&envId=array
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1, last = 0;
        for (int i = 0; i < s.length(); i++) {
            int w = widths[s.charAt(i) - 'a'];
            if (last + w > 100) {
                lines++;
                last = w;
            } else {
                last += w;
            }
        }
        return new int[] { lines, last };
    }
    public static void main(String[] args) {

    }
}
