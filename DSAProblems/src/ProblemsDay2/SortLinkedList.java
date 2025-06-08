package ProblemsDay2;
class ListNode {
   int val;
  ListNode next;
   ListNode() {}
   ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class SortLinkedList {
    //https://leetcode.com/problems/sort-list/
    public static ListNode sortList(ListNode head){

        if(head == null || head.next==null){
            return head;
        }

        ListNode slow = head, fast =head, temp = head;

        while(fast !=null && fast.next !=null){
            temp =slow;
            slow= slow.next;
            fast = fast.next.next;
        }

        temp.next = null;

        ListNode leftStored = sortList(head);
        ListNode rightStored = sortList(slow);

        return mergeList(leftStored,rightStored);
    }

    private static ListNode mergeList(ListNode l1, ListNode l2) {

        ListNode newStored = new ListNode(0);
        ListNode temp = newStored;

        while(l1 != null && l2!=null){
            if(l1.val < l2.val){
                temp.next = l1;
                l1 = l1.next;
            }else{
                temp.next = l2;
                l2 = l2.next;
            }

            temp = temp.next;
        }

        if(l1 != null){
            temp.next = l1;
            l1 = l1.next;
        }

        if(l2 != null){
            temp.next = l2;
            l2 = l2.next;
        }

        return newStored.next;
    }

    public static void main(String[] args) {

/*Input: head = [4,2,1,3]
Output: [1,2,3,4] */

    }
}
