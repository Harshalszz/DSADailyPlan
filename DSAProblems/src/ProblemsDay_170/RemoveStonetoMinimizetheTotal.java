package ProblemsDay_170;

import java.util.PriorityQueue;

public class RemoveStonetoMinimizetheTotal {
//https://leetcode.com/problems/remove-stones-to-minimize-the-total/
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a, b)->b-a);
        for(int i:piles) pq.add(i);
        for(int i=0;i<k;i++){
            int updatedVal=pq.poll();
            updatedVal=(int)Math.ceil(updatedVal/2.0);
            pq.add(updatedVal);
        }
        int ans=0;
        while(!pq.isEmpty()){
            ans+=pq.poll();
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
