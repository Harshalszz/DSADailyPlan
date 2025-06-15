package ProblemsDay8;

public class Numberof1Bits {
//https://leetcode.com/problems/number-of-1-bits/
    public static  int numberof1Bits(int n){
        int res = 0;

        for(int i=0; i<32; i++){
            if(((n>>i) &1) ==1){ //right shift the number and & with 1 , if i the set bit is present.
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int n = 11;
        System.out.println(numberof1Bits(n));

    }
}
