package ProblemsDay_101;

import ProblemsDay_32.Node;

public class CopyListwithRandomPointer {
    //https://leetcode.com/problems/copy-list-with-random-pointer/?envType=study-plan-v2&envId=top-interview-150

    public Node copyRandomList(Node head) {

        //first : insering the copy node in between the original linkedlist

        Node temp = head;

        while(temp!=null){
            Node copyNode = new Node(temp.val);
            copyNode.next = temp.next;
            temp.next = copyNode;

            temp =temp.next.next;
        }

        //Second : connecting the random nodes

        Node temp1 = head;

        while(temp1 != null){
            Node copyNode = temp1.next;

            if(temp1.random != null){
                copyNode.random = temp1.random.next;
            }else{
                copyNode.random = null;
            }
            temp1 = temp1.next.next;
        }

        //Third is to rebuild the orignial linked list

        Node dummy = new Node(-1);
        Node res = dummy;
        Node temp2 = head;

        while(temp2!= null){

            //connecting res to copyNode
            res.next = temp2.next;
            //moving res pointer to next
            res = res.next;


            temp2.next = temp2.next.next;
            temp2 = temp2.next;
        }

        return dummy.next;

    }

    public static void main(String[] args) {

    }
}
