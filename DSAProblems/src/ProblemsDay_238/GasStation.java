package ProblemsDay_238;

public class GasStation {

    //https://leetcode.com/problems/gas-station/
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int sumG =0, sumC=0;
        for(int i=0; i<gas.length; i++){
            sumG +=gas[i];
            sumC +=cost[i];
        }

        if(sumG < sumC){
            return -1;
        }

        int indx =0, sum=0;

        for(int i=0; i<gas.length ; i++){

            sum += gas[i];
            sum -= cost[i];

            if(sum < 0){
                sum =0;
                indx = i+1;
            }
        }

        return indx;

    }
    public static void main(String[] args) {

    }
}
