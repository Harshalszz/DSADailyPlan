package ProblemsDay_53;

public class RobotReturnOrigin {
    //https://leetcode.com/problems/robot-return-to-origin/

    public static boolean judgeCircle(String moves) {

        int upDown = 0;
        int rightLeft = 0;

        for(char i :moves.toCharArray()){
            switch(i){
                case 'L' -> rightLeft++;
                case 'R' -> rightLeft--;
                case 'U' -> upDown++;
                case 'D' -> upDown--;
            }
        }

        return (upDown ==0 && rightLeft == 0);

    }

    public static void main(String[] args) {

        String m = "LLRRULRD";

        System.out.println(judgeCircle(m));

    }
}
