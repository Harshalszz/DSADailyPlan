package ProblemsDay_242;

public class MaximumNestingDepthParentheses {
//https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/?envType=problem-list-v2&envId=string
    public int maxDepth(String s) {
        int count = 0;
        int maxNum = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
                if (maxNum < count)
                    maxNum = count;
            } else if (c == ')') {
                count--;
            }
        }
        return maxNum;
    }
    public static void main(String[] args) {

    }
}
