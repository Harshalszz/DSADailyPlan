package ProblemsDay_209;

import ProblemsDay2.ListNode;

public class RemoveNodesFromLinkedList {

    //https://leetcode.com/problems/remove-nodes-from-linked-list/?envType=problem-list-v2&envId=recursion
    public ListNode removeNodes(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode node = head;
        ListNode nxtGreater = removeNodes(node.next);

        node.next = nxtGreater;
        if (nxtGreater == null || node.val >= nxtGreater.val) {
            return node;
        }
        return nxtGreater;
    }

    public static void main(String[] args) {

    }
}
