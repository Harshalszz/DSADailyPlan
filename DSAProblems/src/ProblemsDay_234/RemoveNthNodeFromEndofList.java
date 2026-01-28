package ProblemsDay_234;

import ProblemsDay2.ListNode;

public class RemoveNthNodeFromEndofList {

    //https://leetcode.com/problems/remove-nth-node-from-end-of-list/
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode resList = new ListNode(0,head);
        ListNode temp = resList;

        for(int i=0; i<n; i++){
            head = head.next;
        }

        while(head !=null){
            head = head.next;
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return resList.next;

    }
    public static void main(String[] args) {

    }
}
