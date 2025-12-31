package ProblemsDay_206;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SmallestStringWithSwaps {

//https://leetcode.com/problems/smallest-string-with-swaps/?envType=problem-list-v2&envId=string
    private class unionMaker{
        int[] parent;
        int[] rank;
        public unionMaker(int n){
            parent = new int[n];
            rank = new int[n];
            for(int i = 0;i < n;i++){
                parent[i] = i;
                rank[i] = 1;
            }
        }
        public int parentFind(int num){
            if(parent[num] == num){
                return num;
            }
            return parent[num] = parentFind(parent[num]);
        }
        public void union(int num1, int num2){
            int prt1 = parentFind(num1);
            int prt2 = parentFind(num2);
            if(prt2 != prt1){
                if(rank[prt1] < rank[prt2]){
                    parent[prt1] = prt2;
                }
                else if(rank[prt1] > rank[prt2]){
                    parent[prt2] = prt1;
                }
                else{
                    parent[prt2] = prt1;
                    rank[prt1]++;
                }
            }
        }
    }
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int len = s.length();
        unionMaker unionMaker = new unionMaker(len);
        for(List<Integer> pair: pairs){
            unionMaker.union(pair.get(0), pair.get(1));
        }

        HashMap<Integer, List<Integer>> collect = new HashMap<>();
        for(int i = 0;i < len;i++){
            int parent = unionMaker.parentFind(i);
            collect.putIfAbsent(parent, new ArrayList<>());
            collect.get(parent).add(i);
        }

        char[] arr = s.toCharArray();
        for(List<Integer> ele: collect.values()){
            List<Character> temp = new ArrayList<>();
            for(int ind: ele){
                temp.add(s.charAt(ind));
            }
            Collections.sort(temp);

            for(int i = 0;i < ele.size();i++){
                arr[ele.get(i)] = temp.get(i);
            }
        }
        return new String(arr);
    }


    public static void main(String[] args) {

    }
}
