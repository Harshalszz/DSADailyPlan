package ProblmesDay_15;

public class HappyNumber {
//https://leetcode.com/problems/happy-number/description/
    public static boolean isHappyNumber(int n){
        int slow = n ,fast = n;

        do{
            slow = genNum(slow);
            fast = genNum(genNum(fast));
        }while(slow != fast);

        return slow == 1;
    }

    private static int genNum(int num) {
        int res = 0;

        while(num > 0){
            int rem = num % 10;
            res += rem*rem;
            num = num / 10;
        }

        return  res;
    }

    public static void main(String[] args) {

        int n = 25;
        System.out.println(isHappyNumber(n));

    }
}
