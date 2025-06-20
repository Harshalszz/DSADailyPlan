package ProblemsDay_14;

import ProblemsDay2.ListNode;

public class AddTwoNumbers {
//https://leetcode.com/problems/add-two-numbers/description/
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){

        ListNode dum = new ListNode();
        ListNode res =dum;
        int total = 0, carry = 0;

        while(l1 !=null || l2!=null || carry !=0){

            total = carry;

            if(l1 != null){
                total += l1.val;
                l1 = l1.next;
            }

            if(l2 !=null){
                total += l2.val;
                l2 = l2.next;
            }

            int currT = total % 10;
            carry = total /10;

            dum.next = new ListNode(currT);
            dum = dum.next;
        }

        return res.next;
    }

    public static void main(String[] args) {

    }
}
