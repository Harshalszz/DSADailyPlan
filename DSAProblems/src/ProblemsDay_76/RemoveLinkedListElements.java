package ProblemsDay_76;

import ProblemsDay2.ListNode;

public class RemoveLinkedListElements {
    //https://leetcode.com/problems/remove-linked-list-elements/

    public ListNode removeElements(ListNode head, int val) {

        if(head==null){
            return head;
        }
        head.next=removeElements(head.next,val);
        return head.val ==val ? head.next : head;

    }

    public static void main(String[] args) {

    }
}
