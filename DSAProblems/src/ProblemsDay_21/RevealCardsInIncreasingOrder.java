package ProblemsDay_21;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class RevealCardsInIncreasingOrder {
//https://leetcode.com/problems/reveal-cards-in-increasing-order/description/
    public static int[] revealCardsInIncreasingOrder(int[] deck){
        int n=deck.length;
        Arrays.sort(deck);
        Deque<Integer> st=new ArrayDeque<>();
        st.addFirst(deck[n-1]);
        for(int i=n-2;i>=0;i--){
            st.addFirst(st.removeLast());
            st.addFirst(deck[i]);
        }
        //we can either create a new array or change the existing since we dont need it right??but it is not recommended

        for(int i=0;i<n;i++){
            deck[i]=(int)st.removeFirst();
        }
        return deck;
    }

    public static void main(String[] args) {

        int[] nums = {17,13,11,2,3,5,7};

        System.out.println(Arrays.toString(revealCardsInIncreasingOrder(nums)));

    }
}
