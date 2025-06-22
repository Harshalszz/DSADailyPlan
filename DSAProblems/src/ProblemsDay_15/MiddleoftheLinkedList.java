package ProblemsDay_15;

import ProblemsDay2.ListNode;

public class MiddleoftheLinkedList {
//https://leetcode.com/problems/middle-of-the-linked-list/description/
    public static ListNode middleoftheLinkedList(ListNode head){

        ListNode slow = head, fast = head;

        while(fast != null && fast.next!= null){
            slow =slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static void main(String[] args) {

    }
}
