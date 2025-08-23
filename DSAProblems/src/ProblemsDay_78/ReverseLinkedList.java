package ProblemsDay_78;

import ProblemsDay2.ListNode;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {


        ListNode prev = null;

        while(head !=null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }

        return prev;
    }

    public static void main(String[] args) {

    }
}
