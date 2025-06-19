package ProblemsDay_13;

import ProblemsDay2.ListNode;

public class RotateList {
//https://leetcode.com/problems/rotate-list/description/
    public static ListNode rotateList(ListNode head){
        int k = 2;

        int l = 1;
        ListNode n = head;
        while(n.next != null){
            l++;
            n = n.next;
        }
        n.next = head;

        k= k%l;

        if(k == 0){
            n.next = null;
            return head;
        }
        ListNode temp = head;
        for(int i=1; i<l-k;i++){
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;

        return head;
    }

    public static void main(String[] args) {

    }
}
