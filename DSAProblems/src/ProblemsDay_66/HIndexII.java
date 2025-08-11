package ProblemsDay_66;

public class HIndexII {
    //https://leetcode.com/problems/h-index-ii/

    public int hIndex(int[] citations) {

        int start =0, end = citations.length-1;
        int n = citations.length;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(citations[mid] == (n-mid)){
                return citations[mid];
            }else if(citations[mid] > (n-mid)){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return n- start;

    }

    public static void main(String[] args) {

    }
}
