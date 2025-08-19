package ProblemsDay_74;

public class FindtheHighestAltitude {
    //https://leetcode.com/problems/find-the-highest-altitude/?envType=study-plan-v2&envId=leetcode-75

    public int largestAltitude(int[] gain) {

        int currSum = 0, maxSum=0;

        for(int num: gain){
            currSum += num;
            maxSum = Math.max(maxSum,currSum);
        }

        return maxSum;

    }

    public static void main(String[] args) {

    }
}
