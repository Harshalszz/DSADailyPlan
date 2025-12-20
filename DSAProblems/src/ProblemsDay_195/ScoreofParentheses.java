package ProblemsDay_195;

import java.util.Stack;

public class ScoreofParentheses {
//https://leetcode.com/problems/score-of-parentheses/?envType=problem-list-v2&envId=string
    public int scoreOfParentheses(String s) {

        int score = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(c=='('){
                stack.push(score);
                score=0;
            }
            else{
                int prev = stack.pop();

                if(score==0){
                    score = prev+1;
                }
                else{
                    score = prev + 2*score;
                }
            }
        }
        return score;
    }

    public static void main(String[] args) {

    }
}
