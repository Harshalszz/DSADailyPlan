package ProblemsDay_79;

import java.util.ArrayList;
import java.util.List;

public class ZigzagGridTraversalWithSkip {

    //https://leetcode.com/problems/zigzag-grid-traversal-with-skip/

    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> ans = new ArrayList<>();

        int n = grid.length;
        int m = grid[0].length;

        for(int i = 0; i< n ; i++){
            if(i%2  == 0){
                for(int j = 0 ; j < m ; j++){
                    if((i+j) % 2 == 0){
                        ans.add(grid[i][j]);
                    }
                }

            }else{

                for(int j = m-1 ; j >= 0 ; j--){
                    if((i+j) % 2 == 0){
                        ans.add(grid[i][j]);
                    }
                }

            }
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
