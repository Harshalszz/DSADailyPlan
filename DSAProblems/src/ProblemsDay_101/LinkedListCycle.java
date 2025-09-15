package ProblemsDay_101;

import ProblemsDay2.ListNode;

public class LinkedListCycle {
    //https://leetcode.com/problems/linked-list-cycle/?envType=study-plan-v2&envId=top-interview-150

    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {

    }
}
