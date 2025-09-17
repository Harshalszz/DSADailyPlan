package ProblmesDay_103;

import ProblemsDay2.ListNode;

public class PartitionList {

    //https://leetcode.com/problems/partition-list/?envType=study-plan-v2&envId=top-interview-150

    public ListNode partition(ListNode head, int x) {

        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);
        ListNode smallP = small;
        ListNode largeP = large;

        while(head != null){

            if(head.val < x){
                smallP.next = head;
                smallP = smallP.next;
            }else{
                largeP.next = head;
                largeP = largeP.next;
            }

            head = head.next;
        }

        smallP.next = large.next;
        largeP.next = null;

        return small.next;

    }

    public static void main(String[] args) {

    }
}
