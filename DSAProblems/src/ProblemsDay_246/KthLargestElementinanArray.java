package ProblemsDay_246;

import java.util.PriorityQueue;

public class KthLargestElementinanArray {
//https://leetcode.com/problems/kth-largest-element-in-an-array/
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> mHeap = new PriorityQueue<>();

        for (int num : nums) {
            mHeap.add(num);
            if (mHeap.size() > k) {
                mHeap.poll();
            }
        }

        return mHeap.peek();
    }
    public static void main(String[] args) {

    }
}
