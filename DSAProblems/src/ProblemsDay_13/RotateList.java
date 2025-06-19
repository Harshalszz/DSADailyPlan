package ProblemsDay_13;

import ProblemsDay2.ListNode;

public class RotateList {
//https://leetcode.com/problems/rotate-list/description/
    public static ListNode rotateList(ListNode head){
        int k = 2;
        //find the len and tail of the list
        int l = 1;
        ListNode n = head;
        while(n.next != null){
            l++;
            n = n.next;
        }
        //point the tail to head

        n.next = head;

        k= k%l;
        // if k is multple of length of list , same head will be return
        if(k == 0){
            n.next = null;
            return head;
        }

        //move the temp to l-k
        ListNode temp = head;
        for(int i=1; i<l-k;i++){
            temp = temp.next;
        }
        //now new head will be temp.next;
        head = temp.next;
        temp.next = null;

        return head;
    }

    public static void main(String[] args) {

    }
}
