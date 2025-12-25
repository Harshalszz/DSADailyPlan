package ProblemsDay_200;

public class RemoveOutermostParentheses {
//https://leetcode.com/problems/remove-outermost-parentheses/?envType=problem-list-v2&envId=string
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (count > 0) result.append(ch);
                count++;
            } else {
                count--;
                if (count > 0) result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

    }
}
