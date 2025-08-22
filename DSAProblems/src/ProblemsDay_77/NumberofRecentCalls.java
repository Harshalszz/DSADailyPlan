package ProblemsDay_77;

import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {

    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();

    }

    public int ping(int t) {
        queue.add(t);

        while(t - queue.peek() > 3000){
            queue.poll();
        }

        return queue.size();

    }
}
public class NumberofRecentCalls {
//https://leetcode.com/problems/number-of-recent-calls/?envType=study-plan-v2&envId=leetcode-75
    public static void main(String[] args) {

    }
}
