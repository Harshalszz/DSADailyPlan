package ProblemsDay_97;

public class GasStation {

    //https://leetcode.com/problems/gas-station/?envType=study-plan-v2&envId=top-interview-150

    public int canCompleteCircuit(int[] gas, int[] cost) {

        int totalCost =0 , totalGas = 0;

        for(int i=0; i<gas.length; i++){
            totalCost += cost[i];
            totalGas += gas[i];
        }

        if(totalGas < totalCost){
            return -1;
        }

        int currentGas = 0, startIndex =0 ;

        for(int i=0; i<gas.length; i++){

            currentGas += gas[i] - cost[i];

            if(currentGas <0){
                currentGas = 0;
                startIndex = i+1;

            }
        }

        return startIndex;
    }

    public static void main(String[] args) {

    }
}
