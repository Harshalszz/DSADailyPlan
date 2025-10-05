package ProblemsDay_120;

import ProblemsDay2.ListNode;
//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/?envType=problem-list-v2&envId=linked-list
public class ConvertBinaryNumberLinkedListInteger {

    public int getDecimalValue(ListNode head) {

        int decimal = 0;
        while (head != null) {
            decimal = (decimal << 1) | head.val;
            head = head.next;
        }
        return decimal;

    }
    public static void main(String[] args) {

    }
}
