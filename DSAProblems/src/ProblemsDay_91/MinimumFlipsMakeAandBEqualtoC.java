package ProblemsDay_91;

public class MinimumFlipsMakeAandBEqualtoC {

    public static void main(String[] args) {
        int a = 2, b = 6, c = 5;

        int flips=0;

        while(a>0 || b>0 || c>0){

            int bitA = a&1;
            int bitB = b&1;
            int bitC = c&1;


            if(bitC == 1) {
                flips += bitA + bitB;
            }else{
                if(bitA == 1 && bitB == 1){
                    flips +=1;
                }
            }

            a>>=1;
            b>>=1;
            c>>=1;
        }

        System.out.println( "flips " + flips);
    }
}
