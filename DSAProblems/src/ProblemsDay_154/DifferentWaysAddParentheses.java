package ProblemsDay_154;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DifferentWaysAddParentheses {

    //https://leetcode.com/problems/different-ways-to-add-parentheses/?envType=problem-list-v2&envId=string
    Map<String, List<Integer>> map = new HashMap<>();
    public List<Integer> diffWaysToCompute(String expression) {
        if(map.containsKey(expression)){
            return map.get(expression);
        }
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<expression.length(); i++){
            char ch = expression.charAt(i);
            if(ch=='*' || ch == '+' ||ch=='-'){
                List<Integer> left = diffWaysToCompute(expression.substring(0,i));
                List<Integer> right = diffWaysToCompute(expression.substring(i+1));

                for (int l : left) {
                    for (int r : right) {
                        if (ch == '+') {
                            result.add(l + r);
                        } else if (ch == '-') {
                            result.add(l - r);
                        } else if (ch == '*') {
                            result.add(l * r);
                        }
                    }
                }
            }
        }
        if (result.isEmpty()) {
            result.add(Integer.parseInt(expression));
        }
        map.put(expression, result);

        return result;

    }
    public static void main(String[] args) {

    }
}
