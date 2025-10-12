package ProblemsDay_127;

import ProblemsDay2.ListNode;

public class InsertionSortList {
    //https://leetcode.com/problems/insertion-sort-list/?envType=problem-list-v2&envId=sorting

    public ListNode insertionSortList(ListNode head) {

        ListNode dummy = new ListNode(-1);
        ListNode temp = head;

        while(temp!=null){
            ListNode nextNode = temp.next;
            ListNode prevNode = dummy;

            while(prevNode.next != null && prevNode.next.val <= temp.val){
                prevNode = prevNode.next;
            }

            temp.next = prevNode.next;
            prevNode.next = temp;
            temp = nextNode;
        }

        return dummy.next;

    }

    public static void main(String[] args) {

    }
}
