package ProblemsDay_86;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SmallestNumberInfiniteSet {
    //https://leetcode.com/problems/smallest-number-in-infinite-set/?envType=study-plan-v2&envId=leetcode-75

    class SmallestInfiniteSet {

        int current;
        Set<Integer> set;

        public SmallestInfiniteSet() {
            current = 1;
            set = new HashSet<>();

        }

        public int popSmallest() {

            if(!set.isEmpty()){
                int res = Collections.min(set);
                set.remove(res);
                return res;
            }else{
                current++;
                return current -1;
            }

        }

        public void addBack(int num) {

            if(current>num){
                set.add(num);
            }

        }
    }

    public static void main(String[] args) {

    }
}
