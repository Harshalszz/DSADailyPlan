package ProblemsDay_102;

import ProblemsDay2.ListNode;

public class SwappingNodesLinkedList {
    //https://leetcode.com/problems/swapping-nodes-in-a-linked-list/

    public ListNode swapNodes(ListNode head, int k) {

        ListNode temp = head;
        int lenList = 0;
        // finding the len  of the lsit
        while(temp != null){
            temp = temp.next;
            lenList++;
        }

        //find the kth node from start
        ListNode first = head;

        for(int i=1; i<k; i++){
            first = first.next;
        }
        //find the kth node from end
        ListNode second = head;

        for(int i=1; i<lenList - k +1; i++){
            second = second.next;
        }
        // swapping the two node val;
        int tempVal = first.val;
        first.val = second.val;
        second.val = tempVal;

        return head;


    }

    public static void main(String[] args) {

    }
}
