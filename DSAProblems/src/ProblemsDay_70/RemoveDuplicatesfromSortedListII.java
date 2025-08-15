package ProblemsDay_70;

import ProblemsDay2.ListNode;

public class RemoveDuplicatesfromSortedListII {

    //https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(-1); // Dummy node to handle head removals
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = head;

        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                // Skip all nodes with the same value
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                prev.next = cur.next; // Remove duplicates
            } else {
                prev = prev.next; // Move to next distinct node
            }
            cur = cur.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

    }
}
