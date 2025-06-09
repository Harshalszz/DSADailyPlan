package ProblemsDay3;

import ProblemsDay2.ListNode;

public class MergeTwoSortedLists {
//https://leetcode.com/problems/merge-two-sorted-lists/
    public static ListNode mergeTwoStoredList(ListNode list1, ListNode list2){
        ListNode mergedList = new ListNode(0);
        ListNode temp = mergedList;

        while(list1 != null && list2 !=null){
            if(list1.val < list2.val){
                temp.next = list1;
                list1 = list1.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if(list1 != null){
            temp.next = list1;
            list1 = list1.next;
        }

        if(list2 != null){
            temp.next = list2;
            list2 = list2.next;
        }

        return mergedList.next;
    }

    public static void main(String[] args) {

    }
}
