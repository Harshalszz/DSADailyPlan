package ProblemsDay_12;

import ProblemsDay2.ListNode;

public class IntersectionofTwoLinkedLists {
    //https://leetcode.com/problems/intersection-of-two-linked-lists/
    public static int lenList(ListNode h){
        int l=0;
        while(h.next != null){
            l++;
            h = h.next;
        }

        return l;
    }
    public static ListNode intersectionofTwoLinkedLists(ListNode headA, ListNode headB){
        if(headA == null || headB == null ){
            return null;
        }

        int lenA = lenList(headA);
        int lenB = lenList(headB);

        if(lenA>lenB){
            for(int i=0; i<lenA-lenB ; i++){
                headA = headA.next;
            }
        }else{
            for(int i=0; i<lenB-lenA ; i++){
                headB = headB.next;
            }
        }

        while(headA != null && headB!= null){
            if(headA == headB){
                return headA;
            }else{
                headA = headA.next;
                headB = headB.next;
            }
        }

        return null;
    }
    public static void main(String[] args) {

    }
}
