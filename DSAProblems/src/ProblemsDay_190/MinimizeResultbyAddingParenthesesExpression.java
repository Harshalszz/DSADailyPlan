package ProblemsDay_190;

public class MinimizeResultbyAddingParenthesesExpression {

    //https://leetcode.com/problems/minimize-result-by-adding-parentheses-to-expression/
    public String minimizeResult(String expression) {
        int smallestVal = Integer.MAX_VALUE;
        int leftIndex = -1;
        int rightIndex = -1;
        int plusIndex = -1;

        char[] exp = expression.toCharArray();

        // Find the index of the '+' operator
        for (int i = 0; i < exp.length; i++) {
            if (exp[i] == '+') {
                plusIndex = i;
                break;
            }
        }

        // Iterate through possible combinations
        for (int i = 0; i < plusIndex; i++) {
            for (int j = plusIndex + 1; j < expression.length(); j++) {
                String n1Str = expression.substring(0, i);
                int n1 = 1;
                if (n1Str.length() > 0) {
                    n1 = Integer.parseInt(n1Str);
                }

                String n2Str = expression.substring(i, plusIndex);
                int n2 = Integer.parseInt(n2Str);

                String n3Str = expression.substring(plusIndex + 1, j + 1);
                int n3 = Integer.parseInt(n3Str);

                String n4Str = expression.substring(j + 1);
                int n4 = 1;
                if (n4Str.length() > 0) {
                    n4 = Integer.parseInt(n4Str);
                }

                int currVal = n1 * (n2 + n3) * n4;

                if (currVal < smallestVal) {
                    smallestVal = currVal;
                    leftIndex = i;
                    rightIndex = j + 1;
                }
            }
        }

        // Construct the result string
        StringBuilder ans = new StringBuilder();
        ans.append(expression.substring(0, leftIndex));
        ans.append("(");
        ans.append(expression.substring(leftIndex, rightIndex));
        ans.append(")");
        ans.append(expression.substring(rightIndex));

        return ans.toString();
    }
    public static void main(String[] args) {

    }
}
