package ProblemsDay_154;

import java.util.Stack;

public class RemoveKDigits {

    //https://leetcode.com/problems/remove-k-digits/?envType=problem-list-v2&envId=string
    public String removeKdigits(String num, int k) {
        Stack<Character> stk = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for (char c : num.toCharArray()) {
            while (k > 0 && !stk.isEmpty() && stk.peek() > c) {
                stk.pop();
                k--;
            }
            stk.push(c);
        }
        while (k > 0) {
            stk.pop();
            k--;
        }
        for (char c : stk) {
            if (ans.length() == 0 && c == '0') continue;
            ans.append(c);
        }
        return ans.length() == 0 ? "0" : ans.toString();
    }
    public static void main(String[] args) {

    }
}
