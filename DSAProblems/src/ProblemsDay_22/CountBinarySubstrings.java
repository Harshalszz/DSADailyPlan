package ProblemsDay_22;

public class CountBinarySubstrings {
//https://leetcode.com/problems/count-binary-substrings/description/
    public static int countBinarySubstrings(String s){
        //000111 -> 3 substring with equal number of 0s 1s -> 000111 , 0011,01
        //ex : 0000111 -> still 3 -> count = min(count1,count0);
        //00001110011 -> 8

        int prev=0, curr =1, count=0;

        for(int i=1; i<s.length();i++){
            if(s.charAt(i) != s.charAt(i-1)){//if prv and curr ele is not same
                count += Math.min(prev,curr);
                prev = curr;
                curr=1;
            }else{
                curr++;
            }

        }

        count += Math.min(curr,prev);

        return count;
    }

    public static void main(String[] args) {

        String s ="00110011";

        System.out.println(countBinarySubstrings(s));

    }
}
