package ProblemsDay_142;

import java.util.Arrays;

public class BoatsSavePeople {

//    //https://leetcode.com/problems/boats-to-save-people/?envType=problem-list-v2&envId=two-pointers
    public int numRescueBoats(int[] people, int limit) {
        int count =0;
        Arrays.sort(people);
        int left =0 , right =  people.length -1;

        while(left<=right){
            if(people[left]+people[right] <= limit){
                left++;
            }
            right--;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
