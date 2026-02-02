package ProblemsDay_239;

import ProblemsDay2.ListNode;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {

        ListNode slow = head , fast =head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;

        while(slow != null){
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        ListNode first = head, second = prev;

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
