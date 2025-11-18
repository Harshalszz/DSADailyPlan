package ProblemsDay_163;

import ProblemsDay2.ListNode;

public class LinkedListComponents {

    //https://leetcode.com/problems/linked-list-components/?envType=problem-list-v2&envId=array
    public int numComponents(ListNode head, int[] nums) {
        int n=0;
        ListNode temp1=head;
        while(temp1!=null){
            n++;
            temp1=temp1.next;
        }
        boolean seen[]=new boolean[n],isSt=false;
        for(int num:nums) seen[num]=true;
        ListNode temp=head;
        int totComp=0;
        while(temp!=null){
            if(!isSt&&seen[temp.val]){
                totComp++;
                isSt=true;
                seen[temp.val]=false;
            }
            else if(!seen[temp.val]) isSt=false;
            temp=temp.next;
        }
        return totComp;
    }
    public static void main(String[] args) {

    }
}
