package ProblemsDay_234;

import ProblemsDay2.ListNode;

public class ReverseLinkedList {

    //https://leetcode.com/problems/reverse-linked-list/
    public ListNode reverseList(ListNode head) {

        ListNode prev=null, curr=head;

        while(curr !=null){

            ListNode nextNode = curr.next;
            curr.next = prev;
            prev= curr;
            curr = nextNode;
        }

        return prev;

    }
    public static void main(String[] args) {

    }
}
