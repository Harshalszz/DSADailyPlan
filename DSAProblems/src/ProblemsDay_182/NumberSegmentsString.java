package ProblemsDay_182;

public class NumberSegmentsString {
//https://leetcode.com/problems/number-of-segments-in-a-string/?envType=problem-list-v2&envId=string
    public int countSegments(String s) {
        int count = 0;
        boolean inSegment = false;
        for (char c : s.toCharArray()) {
            if (c != ' ' && !inSegment) {
                count++;
                inSegment = true;
            } else if (c == ' ') {
                inSegment = false;
            }
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
