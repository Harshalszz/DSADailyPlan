package ProblemsDay_70;

public class Base7 {
    //https://leetcode.com/problems/base-7/


    public String convertToBase7(int num) {
        if(num==0){
            return "0";
        }
        boolean nega = num<0;
        num=Math.abs(num);
        StringBuilder sb= new StringBuilder();
        while(num>0){
            int rem = num%7;
            sb.append(rem+"");
            num/=7;
        }
        if(nega){
            sb.append("-");
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {

    }
}
