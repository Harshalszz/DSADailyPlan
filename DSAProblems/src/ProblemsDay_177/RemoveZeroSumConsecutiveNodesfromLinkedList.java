package ProblemsDay_177;

import java.util.HashMap;
import java.util.Map;

public class RemoveZeroSumConsecutiveNodesfromLinkedList {
//https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/?envType=problem-list-v2&envId=linked-list

    public ListNode removeZeroSumSublists(ListNode head) {
        int prefixSum = 0;
        Map<Integer, ListNode> sumNodeMp = new HashMap<>();
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        sumNodeMp.put(0, dummyHead);
        for(ListNode curr = head; curr != null; curr = curr.next){
            prefixSum += curr.val;
            if(sumNodeMp.containsKey(prefixSum)){
                ListNode prevAnchor = sumNodeMp.get(prefixSum);
                int sumToBeRmd = prefixSum;
                while(prevAnchor != curr){
                    prevAnchor = prevAnchor.next;
                    sumToBeRmd += (prevAnchor != null ) ? prevAnchor.val : 0;
                    if(prevAnchor != curr)
                        sumNodeMp.remove(sumToBeRmd);

                }
                sumNodeMp.get(prefixSum).next = curr.next;
            }else if(prefixSum != 0)
                sumNodeMp.put(prefixSum, curr);
        }
        return dummyHead.next;
    }
    public static void main(String[] args) {

    }

}
