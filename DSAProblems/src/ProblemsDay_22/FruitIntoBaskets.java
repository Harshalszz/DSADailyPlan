package ProblemsDay_22;

import java.util.HashMap;

public class FruitIntoBaskets {
//https://leetcode.com/problems/fruit-into-baskets/description/
    public static int fruitIntoBaskets(int[] fruits){
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int l=0, r=0, maxlen = 0;

        // while(r<fruits.length){
        //     map.put(fruits[r] , map.getOrDefault(fruits[r],0)+1);

        //     while(map.size() > 2){
        //         map.put(fruits[l] , map.get(fruits[l] ) - 1);
        //         if(map.get(fruits[l]) == 0){
        //             map.remove(fruits[l]);
        //         }

        //         l++;
        //     }

        //     if(map.size() <=2){
        //         maxlen = Math.max(maxlen, r-l+1);
        //     }

        //     r++;
        // }

        // return maxlen;

        HashMap<Integer,Integer> map = new HashMap<>();

        int l=0,r=0,maxlen=0;

        while(r<fruits.length){
            map.put(fruits[r], map.getOrDefault(fruits[r],0)+1);

            if(map.size() > 2){
                map.put(fruits[l], map.get(fruits[l]) -1);
                if(map.get(fruits[l]) == 0){
                    map.remove(fruits[l]);
                }
                l++;
            }

            if(map.size() <=2){
                maxlen = Math.max(maxlen, r-l+1);
            }

            r++;
        }

        return maxlen;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,2,2};

        System.out.println(fruitIntoBaskets(nums));

    }
}
