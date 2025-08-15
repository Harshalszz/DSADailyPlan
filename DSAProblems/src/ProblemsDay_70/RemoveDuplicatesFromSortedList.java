package ProblemsDay_70;

import ProblemsDay2.ListNode;

public class RemoveDuplicatesFromSortedList {

    //https://leetcode.com/problems/remove-duplicates-from-sorted-list/

    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;

        while(temp!=null && temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
