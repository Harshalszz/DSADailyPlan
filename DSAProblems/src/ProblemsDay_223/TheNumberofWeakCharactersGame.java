package ProblemsDay_223;

import java.util.Arrays;

public class TheNumberofWeakCharactersGame {

    //https://leetcode.com/problems/the-number-of-weak-characters-in-the-game/?envType=problem-list-v2&envId=monotonic-stack
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties,(a, b)-> (a[0]==b[0])?a[1]-b[1]:b[0]-a[0]);
        int max = -1,res = 0;
        for(int[] property: properties){
            if(property[1] < max) res++;
            else max = property[1];
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
