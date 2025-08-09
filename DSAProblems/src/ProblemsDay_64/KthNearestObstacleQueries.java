package ProblemsDay_64;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthNearestObstacleQueries {

        //https://leetcode.com/problems/k-th-nearest-obstacle-queries/
    public int[] resultsArray(int[][] queries, int k) {

        int[] res = new int[queries.length];
        //we have to return kth smallest distance from rigin so need to use maxheap.
        // int counter = 1;

        // for(int i=0 ; i<queries.length; i++){
        //     if(counter >= k){

        //         res[i] = Math.abs(queries[i][0]) + Math.abs(queries[i][1]);
        //     }else{
        //         res[i] = -1;
        //         counter++;
        //     }
        // }

        // Max heap to keep k smallest distances
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0];
            int y = queries[i][1];
            int distance = Math.abs(x) + Math.abs(y);

            if (maxHeap.size() < k) {
                maxHeap.offer(distance);
            } else if (distance < maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.offer(distance);
            }

            if (maxHeap.size() < k) {
                res[i] = -1;
            } else {
                res[i] = maxHeap.peek();
            }
        }

        return res;

    }


    public static void main(String[] args) {

    }
}
