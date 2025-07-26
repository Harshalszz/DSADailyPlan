package ProblemsDay_50;

public class GetEqualSubstringsWithinBudget {
//https://leetcode.com/problems/get-equal-substrings-within-budget/

    public int equalSubstring(String s, String t, int maxCost) {

        int start = 0;
        int maxLen = 0;
        int currCost = 0;

        for(int end=0; end<s.length() ; end++){

            currCost += Math.abs(s.charAt(end) - t.charAt(end));

            if(currCost>maxCost){
                currCost -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }

            maxLen = Math.max(maxLen, end-start+1);

        }

        return maxLen;



    }
    public static void main(String[] args) {

    }
}
