package ProblemsDay_77;

import ProblemsDay2.ListNode;

public class DeletetheMiddleNodeLinkedList {
    //https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/?envType=study-plan-v2&envId=leetcode-75

    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = null;

        while (fast != null && fast.next != null) {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        temp.next = slow.next;
        return head;
    }

    public static void main(String[] args) {

    }
}
