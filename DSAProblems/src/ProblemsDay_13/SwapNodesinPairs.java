package ProblemsDay_13;

import ProblemsDay2.ListNode;

public class SwapNodesinPairs {
//https://leetcode.com/problems/swap-nodes-in-pairs/description/
    public static ListNode swapNodesinPairs(ListNode head){

        ListNode dumm = new ListNode(0,head);
        ListNode prev = dumm;
        ListNode curr = head;

        while(curr != null && curr.next !=null){
            ListNode second = curr.next;
            ListNode secondNext = curr.next.next;
            second.next = curr;
            curr.next = secondNext;
            prev.next = second;
            prev = curr;
            curr = secondNext;
        }

        return  dumm.next;
    }

    public static void main(String[] args) {

    }
}
