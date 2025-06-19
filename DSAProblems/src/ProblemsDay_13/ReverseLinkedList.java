package ProblemsDay_13;

import ProblemsDay2.ListNode;

import java.util.List;

public class ReverseLinkedList {
//https://leetcode.com/problems/reverse-linked-list/description/
    public static ListNode reverseLinkedList(ListNode head){

        ListNode prev = null;

        while(head!=null){
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
