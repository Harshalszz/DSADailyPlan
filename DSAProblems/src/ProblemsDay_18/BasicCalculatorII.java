package ProblemsDay_18;

import java.util.Stack;

public class BasicCalculatorII {
//https://leetcode.com/problems/basic-calculator-ii/description/
    public static int basicCalculatorII(String s){
        int num = 0;
        char operator = '+';
        Stack<Integer> stac = new Stack<>();
        char[] cha = s.toCharArray();
        int i=0;
        for (char ch:cha) {
            if (Character.isDigit(ch)) {
                num = num*10+(ch-'0');
            }
            if (!Character.isDigit(ch) && ch!=' ' || i==s.length()-1){
                if(operator=='/'){
                    stac.push(stac.pop()/num);
                }else if(operator=='*'){
                    stac.push(stac.pop()*num);
                } else if(operator=='+'){
                    stac.push(num);
                }else{
                    stac.push(-num);
                }
                operator = ch;
                num = 0;
            }
            i++;
        }
        int ans= 0;
        while(!stac.isEmpty()){
            ans+=stac.pop();
        }
        return ans;

    }

    public static void main(String[] args) {

        String s = "3+2*2*2";
        System.out.println(basicCalculatorII(s));

    }
}
