package ProblemsDay_18;

import java.util.Stack;

public class RemovingStarsFromaString {
//https://leetcode.com/problems/removing-stars-from-a-string/description/


    public static String isRemovingStarsFromaString(String s){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '*' && !stack.isEmpty()){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }

        StringBuilder res = new StringBuilder();
        for(char c : stack){
            res.append(c);
        }

        return res.toString();
    }

    //second methodby using stringbuilder only

    public static String Solution2(String s){

        StringBuilder res = new StringBuilder();

        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == '*'){
                if(res.length() >0){
                    res.deleteCharAt(res.length() - 1);
                }
            }else{
                res.append(s.charAt(i));
            }
        }

        return res.toString();

    }

    public static void main(String[] args) {

        String s = "leet**cod*e" ;
        System.out.println(isRemovingStarsFromaString(s));

        System.out.println(Solution2(s));

    }
}
