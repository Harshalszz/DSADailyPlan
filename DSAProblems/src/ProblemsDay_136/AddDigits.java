package ProblemsDay_136;

public class AddDigits {

    //https://leetcode.com/problems/add-digits/?envType=problem-list-v2&envId=math
    public int addDigits(int num) {
        int sum=0;
        while(num>=10)
        {
            sum=0;
            while(num>0)
            {
                int temp= num%10;
                sum+=temp;
                num/=10;
            }
            num=sum;
        }
        return num;
    }

    public static void main(String[] args) {

    }
}
