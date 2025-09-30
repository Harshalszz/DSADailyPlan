package ProblemsDay_115;

public class FindSmallestLetterGreaterThanTarget {

    //https://leetcode.com/problems/find-smallest-letter-greater-than-target/?envType=study-plan-v2&envId=binary-search
    public char nextGreatestLetter(char[] letters, char target) {

        int left = 0, right = letters.length -1;

        while(left<=right){

            int mid = left + (right - left)/2;

            if(letters[mid] <= target ){
                left = mid +1;
            }else{
                right= mid -1;
            }
        }

        return letters[left % letters.length];

    }

    public static void main(String[] args) {

    }
}
