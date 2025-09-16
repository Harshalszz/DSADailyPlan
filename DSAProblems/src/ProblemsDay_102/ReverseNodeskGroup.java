package ProblemsDay_102;

import ProblemsDay2.ListNode;

public class ReverseNodeskGroup {

    //https://leetcode.com/problems/reverse-nodes-in-k-group/?envType=study-plan-v2&envId=top-interview-150

    public ListNode reverseList(ListNode head){
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    public ListNode findKthNode(ListNode temp, int k){
        k = k-1;

        while(temp !=null && k>0){
            k--;
            temp = temp.next;

        }

        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = head;
        ListNode prevNode = null;

        while(temp != null){

            ListNode kThNode = findKthNode(temp, k);

            if(kThNode == null){
                if(prevNode !=null){
                    prevNode.next = temp;
                }
                break;
            }

            ListNode nextNode = kThNode.next;
            kThNode.next = null;

            reverseList(temp);

            if(temp == head){
                head = kThNode;
            }else{
                prevNode.next = kThNode;
            }

            prevNode = temp;
            temp = nextNode;
        }

        return head;

    }

    public static void main(String[] args) {

    }
}
