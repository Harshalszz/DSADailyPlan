package ProblemsDay_231;

import ProblemsDay2.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextGreaterNodeLinkedList {

    //https://leetcode.com/problems/next-greater-node-in-linked-list/?envType=problem-list-v2&envId=array
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> values = new ArrayList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }

        int len = values.size();

        int[] result = new int[len];
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < len; i++) {
            int currVal = values.get(i);

            while (!stk.isEmpty() && values.get(stk.peek()) < currVal)
                result[stk.pop()] = currVal;

            stk.push(i);
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
