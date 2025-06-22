package ProblemsDay_15;

import ProblemsDay2.ListNode;

public class LinkedListCycleII {
//https://leetcode.com/problems/linked-list-cycle-ii/description/
    public static ListNode linkedListCycleII(ListNode head){

        if(head == null || head.next == null){
            return null;
        }

        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast == null || fast.next == null) return null;

        fast = head;

        while(fast != slow){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static void main(String[] args) {

    }
}
