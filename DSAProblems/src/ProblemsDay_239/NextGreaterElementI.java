package ProblemsDay_239;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // int result[] = new int[nums1.length];

        // //finding nextGreater for nums2
        // int nextGreater[] = new int[nums2.length];
        // Stack<Integer> s = new Stack<>();
        // for(int i=nums2.length-1; i>=0; i--){
        //     while(!s.isEmpty() && nums2[i] >= nums2[s.peek()]){
        //         s.pop();
        //     }
        //     if(s.isEmpty()){
        //         nextGreater[i] = -1;
        //     }else{
        //         nextGreater[i] = nums2[s.peek()];
        //     }
        //     s.push(i);
        // }

        // Map<Integer,Integer> map = new HashMap<>();
        // for(int i=0; i<nextGreater.length; i++){
        //     map.put(nums2[i],nextGreater[i]);
        // }

        // for(int i=0; i<nums1.length; i++){
        //     result[i] = map.get(nums1[i]);
        // }
        // return result;

        // HashMap<Integer, Integer> nextMap = new HashMap<>();
        // Stack<Integer> stack = new Stack<>();


        // for(int num : nums2){
        //     while(!stack.isEmpty() && stack.peek()<num ){
        //         nextMap.put(stack.pop(), num);
        //     }

        //     stack.push(num);
        // }


        // //changing the num1 aaray

        // for(int i=0; i<nums1.length; i++){
        //     nums1[i] = nextMap.getOrDefault(nums1[i], -1);
        // }


        // return nums1;

        Stack<Integer> stack = new Stack<>();

        int[] nextGra = new int[nums2.length];

        for(int i= nums2.length -1; i>=0 ; i--){

            while(!stack.isEmpty() && stack.peek() < nums2[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                nextGra[i] = -1;
            }else{
                nextGra[i] = stack.peek();
            }

            stack.push(nums2[i]);
        }
        //mapping nums2 next gereated
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums2.length; i++){
            map.put(nums2[i], nextGra[i]);
        }

        for(int j=0; j<nums1.length; j++){

            nums1[j] = map.get(nums1[j]);
        }

        return nums1;
    }

    public static void main(String[] args) {

    }
}
