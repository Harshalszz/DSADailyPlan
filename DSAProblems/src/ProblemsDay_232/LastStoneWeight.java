package ProblemsDay_232;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LastStoneWeight {

    //https://leetcode.com/problems/last-stone-weight/?envType=problem-list-v2&envId=array
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i=0 ; i<n ; i++) {
            maxHeap.add(stones[i]);
        }

        while (!maxHeap.isEmpty()) {
            int largest = maxHeap.poll();
            if (maxHeap.isEmpty()) {
                return largest;
            }
            int secondLargest = maxHeap.poll();
            int difference = largest - secondLargest;
            if (difference != 0) {
                maxHeap.add(difference);
            }
        }
        return 0;
    }
    public static void main(String[] args) {

    }
}
