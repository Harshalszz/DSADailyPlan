package ProblemsDay_85;

public class MinimumAddMakeParenthesesValid {
    //https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
    public int minAddToMakeValid(String s) {
        // Stack<Character> stack = new Stack<>();
        // int size =0;
        // for(char ch : s.toCharArray()){
        //     if(ch == '('){
        //         stack.push(ch);
        //         size++;
        //     }else {
        //          if (!stack.isEmpty()) {
        //             stack.pop();
        //             size--;
        //         } else {
        //             size++;
        //         }
        //     }


        // }

        // return size;

        int open = 0;
        int closed = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                open++;
            } else if (open == 0) {
                closed++;
            } else {
                open--;
            }
        }
        return open + closed;
    }

    public static void main(String[] args) {

    }
}
