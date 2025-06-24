package ProblemsDay_18;

public class LongestValidParentheses {
//https://leetcode.com/problems/longest-valid-parentheses/description/
    public static int longestValidParentheses(String s){
        int[] stack = new int[s.length()+1];
        int index = -1;
        int res = 0;
        stack[++index] = -1;

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack[++index] = i;
            }else {
                index--;
                if(index == -1){
                    stack[++index] = i;
                }else{
                    res = Math.max(res, i-stack[index]);
                }
            }
        }

        return res;

        //Stack<Integer> stack = new Stack<>();
        //        stack.push(-1);
        //        int max_len = 0;
        //
        //        for (int i = 0; i < s.length(); i++) {
        //            if (s.charAt(i) == '(') {
        //                stack.push(i);
        //            } else {
        //                stack.pop();
        //                if (stack.isEmpty()) {
        //                    stack.push(i);
        //                } else {
        //                    max_len = Math.max(max_len, i - stack.peek());
        //                }
        //            }
        //        }
        //
        //        return max_len;
    }

    public static void main(String[] args) {

        String s =")()()())()()";
        System.out.println(longestValidParentheses(s));
    }
}
