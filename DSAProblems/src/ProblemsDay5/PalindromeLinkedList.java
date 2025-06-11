package ProblemsDay5;

import ProblemsDay2.ListNode;

public class PalindromeLinkedList {
//https://leetcode.com/problems/palindrome-linked-list/
    public static boolean isPalindromeLinkedList(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
        }
        //now reverse the seconf half of list
        ListNode prev = null;
        while(slow != null){
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        ListNode first = head;
        ListNode second = prev;

        while(second !=null){
            if(first.val != second.val){
                return false;
            }
            first = first.next;
            second = second.next;
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
