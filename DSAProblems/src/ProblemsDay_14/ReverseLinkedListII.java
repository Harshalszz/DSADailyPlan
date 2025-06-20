package ProblemsDay_14;

import ProblemsDay2.ListNode;

public class ReverseLinkedListII {
//https://leetcode.com/problems/reverse-linked-list-ii/
    public static ListNode reverseLinkedListII(ListNode head){
        int left = 2, right = 4;

        if(head == null || left==right){
            return head;
        }

        ListNode dum = new ListNode(0);
        dum.next = head;
        ListNode prev = dum;

        for(int i=0; i<left-1 ; i++){
            prev = prev.next;
        }

        ListNode curr = prev.next;

        for(int i =0; i< right - left; i++){
            ListNode temp = curr.next;
            curr.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
        }

        return dum.next;
    }

    public static void main(String[] args) {

    }
}
