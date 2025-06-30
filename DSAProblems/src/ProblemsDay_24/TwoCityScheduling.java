package ProblemsDay_24;

import java.util.Arrays;

public class TwoCityScheduling {
//https://leetcode.com/problems/two-city-scheduling/description/
    public static int twoCitySchedCost(int[][] costs) {

        Arrays.sort(costs, (a, b)->{
            return (a[0] -a[1]) - (b[0] - b[1]);// sort the cost aaray based on the profit of sending oa person to one location
            // [[10,20],[30,200],[400,50],[30,20]]
            //  10 , 170, -350, -10
            // 170 10 -10 -350
            // [30, 200] , [10, 20] , [30,20], [400.50]
            //  30 + 10 till n/2 then 20+50
            // 110
        });

        int minCost = 0;

        for(int i=0; i<costs.length ;i++){
            if(i<costs.length/2){
                minCost += costs[i][0];
            }else{
                minCost += costs[i][1];
            }

        }
        return minCost;
    }

    public static void main(String[] args) {

        int[][] nums = {{10,20},{30,200},{400,50},{30,20}};

        System.out.println(twoCitySchedCost(nums));

    }
}
