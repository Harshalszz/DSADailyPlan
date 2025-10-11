package ProblemsDay_126;

import java.util.PriorityQueue;

public class KthLargestElementStream {

    //https://leetcode.com/problems/kth-largest-element-in-a-stream/?envType=problem-list-v2&envId=data-stream
    class KthLargest {
        private int k;
        private PriorityQueue<Integer> minHeap;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            this.minHeap = new PriorityQueue<>(k);
            for (int num : nums) {
                add(num);
            }
        }

        public int add(int val) {
            if (minHeap.size() < k) {
                minHeap.offer(val);
            } else if (val > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(val);
            }
            return minHeap.peek();
        }
    }

    public static void main(String[] args) {

    }
}
