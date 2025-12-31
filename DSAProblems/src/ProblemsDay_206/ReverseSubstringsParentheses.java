package ProblemsDay_206;

public class ReverseSubstringsParentheses {
//https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/?envType=problem-list-v2&envId=string
    int i = 0;
    public String reverseParentheses(String s) {
        char[] ar = s.toCharArray();
        return helper(ar);
    }

    public String helper(char[] s){
        StringBuilder sb = new StringBuilder();

        while(i < s.length){
            if(s[i] == ')'){
                i++;
                return sb.reverse().toString();
            }else if(s[i] == '('){
                i++;
                String st  = helper(s);
                sb.append(st);
            }else{
                sb.append(s[i]);
                i++;
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {

    }
}
