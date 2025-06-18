package ProblemsDay_12;

import ProblemsDay2.ListNode;

public class RemoveNthNodeFromEndofList {
//https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
    public static ListNode removeNthNodeFromEndofList(ListNode head){
        int n = 5; //inputed from the user
        ListNode res = new ListNode(0,head);
        ListNode temp = res;

        for(int i=0;i<n;i++){
            head = head.next;
        }

        while(head !=null){
            head = head.next;
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return res.next;

    }

    public static void main(String[] args) {

    }
}
