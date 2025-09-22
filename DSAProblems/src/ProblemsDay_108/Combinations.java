package ProblemsDay_108;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    //https://leetcode.com/problems/combinations/?envType=study-plan-v2&envId=top-interview-150

    // as we have give the combination will be betweeen 1 to n
    // of size k
    // use acktracking for this
    // if tempList == k add it inot resList
    // loop from 1 to n
    //  add to temp
    // backtrack i+1
    // remove from temp

    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> resList = new ArrayList<>();

        backtracking(1,n,k, resList, new ArrayList<>());

        return resList;

    }


    public void backtracking(int start , int n, int k, List<List<Integer>> resList, List<Integer> tempList){

        if(tempList.size() == k){
            resList.add(new ArrayList(tempList));
            return;
        }

        for(int i= start ; i<=n ;i++){
            tempList.add(i);
            backtracking(i+1, n,k, resList,tempList);
            tempList.remove(tempList.size()-1);
        }
    }


    public static void main(String[] args) {

    }
}
