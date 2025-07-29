package ProblemsDay_53;

public class FurthestPointFromOrigin {
    //https://leetcode.com/problems/furthest-point-from-origin/description/

    public static int furthestDistanceFromOrigin(String moves) {

        int blank = 0;
        int rightLeft = 0;

        for(char i :moves.toCharArray()){
            switch(i){
                case 'L' -> rightLeft++;
                case 'R' -> rightLeft--;
                case '_' -> blank++;

            }
        }

        return Math.abs(rightLeft) + blank;

    }

    public static void main(String[] args) {

        String m = "_R__LL_";
        System.out.println(furthestDistanceFromOrigin(m));

    }
}
