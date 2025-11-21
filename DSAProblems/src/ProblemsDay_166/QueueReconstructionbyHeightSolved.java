package ProblemsDay_166;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueueReconstructionbyHeightSolved {

    //https://leetcode.com/problems/queue-reconstruction-by-height/?envType=problem-list-v2&envId=array
    public int[][] reconstructQueue(int[][] people) {

        //sort array in desc order ,if equal then sort by k asc
        Arrays.sort(people , (a, b)->{
                    if(a[0] == b[0]){
                        return a[1] - b[1];
                    }
                    return b[0] - a[0];
                }
        );

        //Insert into list based on k value
        List<int[]> result = new ArrayList<>();
        for(int[] peoples : people){
            result.add(peoples[1],peoples);
        }

        //Convert list to array
        return result.toArray(new int[people.length][]);
    }
    public static void main(String[] args) {

    }
}
