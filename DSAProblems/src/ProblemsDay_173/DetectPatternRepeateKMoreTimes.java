package ProblemsDay_173;

public class DetectPatternRepeateKMoreTimes {

    //https://leetcode.com/problems/detect-pattern-of-length-m-repeated-k-or-more-times/
    public boolean containsPattern(int[] arr, int m, int k) {
        int count = 0;

        for(int i=0; i+m<arr.length; i++){
            count = arr[i] == arr[i+m] ? count +1 : 0;

            if(count == (k-1)*m)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
