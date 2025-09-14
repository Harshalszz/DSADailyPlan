package ProblemsDay_100;

import java.util.Stack;

public class SimplifyPath {
    //https://leetcode.com/problems/simplify-path/?envType=study-plan-v2&envId=top-interview-150

    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();

        String[] pathArray = path.split("/");

        for(String str : pathArray){

            if(str.equals(".") || str.isEmpty()){
                continue;
            }else if(str.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(str);
            }
        }

        if (stack.isEmpty()) {
            return "/";
        }

        StringBuilder res = new StringBuilder();

        for(String str : stack){
            res.append("/").append(str);
        }


        return res.toString();
    }

    public static void main(String[] args) {

    }
}
