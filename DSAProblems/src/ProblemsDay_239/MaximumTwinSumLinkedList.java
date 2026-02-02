package ProblemsDay_239;

import ProblemsDay2.ListNode;

public class MaximumTwinSumLinkedList {

    public int pairSum(ListNode head) {

        ListNode slow =head ,fast = head;

        while(fast != null && fast.next!=null){
            slow= slow.next;
            fast=fast.next.next;
        }

        ListNode prev = null;

        while(slow != null){
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        //now prev is at the middle of the linkedlist
        //And it is the head of the reversed half leinkedt list
        ListNode first = head;
        int maxSum = 0;

        while(prev !=null){

            maxSum = Math.max(maxSum, first.val + prev.val);
            first =first.next;
            prev = prev.next;
        }


        return maxSum;

    }
    public static void main(String[] args) {

    }
}
