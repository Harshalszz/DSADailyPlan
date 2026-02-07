package ProblemsDay_244;

public class PartitioningIntoMinimumNumberOfDeciBinarNumbers {

    public int minPartitions(String n) {
        int res= 0;
        for(int i=0;i<n.length();i++){
            res = Math.max(res,n.charAt(i)-'0');
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
