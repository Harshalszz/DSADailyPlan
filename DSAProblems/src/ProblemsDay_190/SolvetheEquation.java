package ProblemsDay_190;

public class SolvetheEquation {

    //https://leetcode.com/problems/solve-the-equation/?envType=problem-list-v2&envId=string
    public String solveEquation(String equation) {
        String[] parts = equation.split("=");
        int[] leftPart = evaluate(parts[0]);
        int[] rightPart = evaluate(parts[1]);

        // Compare coefficients
        if (leftPart[0] == rightPart[0] && leftPart[1] == rightPart[1]) {
            return "Infinite solutions";
        } else if (leftPart[0] == rightPart[0]) {
            return "No solution";
        }

        return "x=" + (rightPart[1] - leftPart[1]) / (leftPart[0] - rightPart[0]);
    }

    private int[] evaluate(String str) {
        String[] tokens = str.split("(?=[+-])");  // Retain + and - with split tokens
        int[] res = new int[2]; // res[0]: coefficient of x, res[1]: constant sum

        for (String token : tokens) {
            if (token.equals("+x") || token.equals("x")) {
                res[0]++;
            } else if (token.equals("-x")) {
                res[0]--;
            } else if (token.contains("x")) {
                res[0] += Integer.parseInt(token.substring(0, token.length() - 1));
            } else {
                res[1] += Integer.parseInt(token);
            }
        }

        return res;
    }

    public static void main(String[] args) {

    }
}
