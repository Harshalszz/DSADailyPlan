package ProblemsDay_75;

import java.util.HashMap;

public class EqualRowandColumnPairs {

    //https://leetcode.com/problems/equal-row-and-column-pairs/?envType=study-plan-v2&envId=leetcode-75

    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int ans=0;
        HashMap<String, Integer> col = new HashMap<>();
        for(int j=0; j<n; j++){ //putting col in hashmap as a string
            StringBuilder temp = new StringBuilder();
            for(int i=0; i<n; i++){
                temp.append((char)(grid[i][j]+'0'));
            }
            col.put(temp.toString(),col.getOrDefault(temp.toString(),0)+1);
        }

        for(int i=0; i<n; i++){
            StringBuilder temp = new StringBuilder();
            for(int j=0; j<n; j++){
                temp.append((char)(grid[i][j]+'0'));
            }
            ans += col.getOrDefault(temp.toString(), 0);
        }

        return ans;

    }

    public static void main(String[] args) {

    }
}
