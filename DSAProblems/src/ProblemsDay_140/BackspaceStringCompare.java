package ProblemsDay_140;

import java.util.Stack;

public class BackspaceStringCompare {
//https://leetcode.com/problems/backspace-string-compare/?envType=problem-list-v2&envId=stack

    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    public String build(String s){
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c != '#'){
                st.push(c);
            }else if(!st.isEmpty()){
                st.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char u : st){
            sb.append(u);
        }
        return sb.toString();
    }
    public static void main(String[] args) {

    }
}
