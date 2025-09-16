package ProblemsDay_102;

import ProblemsDay2.ListNode;

public class ReverseNodesinEvenLengthGroups {

    //https://leetcode.com/problems/reverse-nodes-in-even-length-groups/

    public ListNode reverseList(ListNode head){
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode curr = head;

        int groupSize = 1;

        while (curr != null) {
            ListNode groupHead = curr;
            int count = 0;

            // Count how many nodes are left in this group
            while (curr != null && count < groupSize) {
                curr = curr.next;
                count++;
            }

            if (count % 2 == 0) {
                // Detach and reverse the group
                ListNode nextGroupHead = curr;
                ListNode temp = groupHead;
                int tempCount = count;
                while (tempCount-- > 1) {
                    temp = temp.next;
                }
                temp.next = null; // break the group

                ListNode reversedHead = reverseList(groupHead);

                // Connect previous part to reversed head
                prev.next = reversedHead;

                // Move to the end of reversed group
                groupHead.next = nextGroupHead;
                prev = groupHead;
            } else {
                // No reversal; move prev to the last node in this group
                for (int i = 0; i < count; i++) {
                    prev = prev.next;
                }
            }

            groupSize++;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

    }
}
