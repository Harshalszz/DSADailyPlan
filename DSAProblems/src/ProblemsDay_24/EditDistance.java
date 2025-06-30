package ProblemsDay_24;

public class EditDistance {

    //https://leetcode.com/problems/edit-distance/
    public static int getOperation(int i, int j, String s1, String s2, int[][] dp){

        if(i<0) {return j+1;} // if s1 pointer i reachs the start, then we will insert the j+1 ele
        if(j<0) {return i+1;} // i s2 pointer j reaches the start , then we eill remove  i+1 elements

        if(dp[i][j] !=-1){
            return dp[i][j]; // memomization
        }

        if(s1.charAt(i) == s2.charAt(j)) {
            return dp[i][j] = getOperation(i-1, j-1,s1,s2,dp);// if char at both the index are same ,then move the i and j pointer.
            //stroing the result in dp
        }

        return dp[i][j] = Math.min(1+getOperation(i-1,j,s1,s2,dp), // inserting
                Math.min(1+getOperation(i,j-1,s1,s2,dp), //deleting
                        1+getOperation(i-1,j-1, s1,s2,dp))); // replacing
    }
    public static void main(String[] args) {

        String word1 ="horse", word2="ros";

        int i = word1.length();
        int j = word2.length();

        int[][] dp = new int[i][j];

        for(int a=0; a<i;a++){
            for(int b=0;b<j;b++){
                dp[a][b] =-1;
            }
        }

        System.out.println(getOperation(i-1,j-1,word1,word2, dp));

    }
}
