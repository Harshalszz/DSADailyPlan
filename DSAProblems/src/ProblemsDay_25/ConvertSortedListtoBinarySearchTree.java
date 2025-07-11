package ProblemsDay_25;

import ProblemsDay2.ListNode;

public class ConvertSortedListtoBinarySearchTree {

    //https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/
    public TreeNode sortedListToBST(ListNode head) {

        if(head == null) {return null;}

        if(head.next == null){ return new TreeNode(head.val);}

        ListNode slow = head;
        ListNode fast = head;
        ListNode mid = slow;

        while(fast !=null && fast.next !=null){
            mid = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        TreeNode node = new TreeNode(slow.val);

        mid.next = null;

        node.left = sortedListToBST(head);
        node.right = sortedListToBST(slow.next);

        return node;

    }
    public static void main(String[] args) {

    }
}
