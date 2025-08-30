package ProblemsDay_85;

public class MinimumNumberofSwapstoMaketheStringBalanced {
    //https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/
    public int minSwaps(String s) {

        int closing = 0;
        int maxClosing = 0;

        for(char ch : s.toCharArray()){
            if(ch == '['){
                closing--;
            }else{
                closing++;
            }

            maxClosing = Math.max(maxClosing,closing);
        }
        //as there are equal number of closing and opening brackets
        //And we have to deal with only imblanced number of closing brackets
        //observation is minimum swap will be  = imblacne count + 1 / 2
        return (maxClosing+1)/2;

    }
    public static void main(String[] args) {

    }
}
