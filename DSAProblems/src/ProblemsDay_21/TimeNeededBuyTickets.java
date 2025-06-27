package ProblemsDay_21;

public class TimeNeededBuyTickets {
//https://leetcode.com/problems/time-needed-to-buy-tickets/description/
    public static int timeNeededBuyTickets(int[] tickets, int k){
        int totalTime = 0;

        for(int i=0; i<tickets.length; i++){

            if(i<=k){
                totalTime += Math.min(tickets[k] , tickets[i]);
            }else{
                totalTime += Math.min(tickets[k] -1 , tickets[i]);
            }
        }

        return totalTime;
    }

    public static void main(String[] args) {

        int[] nums = {5,1,1,1};
        int k =0;

        System.out.println(timeNeededBuyTickets(nums,k));

    }
}
