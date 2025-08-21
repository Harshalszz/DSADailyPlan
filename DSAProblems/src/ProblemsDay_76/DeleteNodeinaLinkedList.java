package ProblemsDay_76;

import ProblemsDay2.ListNode;

public class DeleteNodeinaLinkedList {
    //https://leetcode.com/problems/delete-node-in-a-linked-list/

    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;

    }

    public static void main(String[] args) {

    }
}
