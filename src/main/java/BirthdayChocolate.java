import java.util.Scanner;

/**
 * Created by Ursus on 6/6/2017.
 * https://www.hackerrank.com/challenges/the-birthday-bar?h_r=next-challenge&h_v=zen
 */
public class BirthdayChocolate {


    static int solve(int sizeOfChocolateBar, int[] barArray, int intendedSum, int intendedNumberOfSquares){
        int numberOfWaysToSum = 0 ;
        int currentSum = 0 ;
        int currentNumberOfSquares = 0;
        for (int i = 0 ; i < barArray.length;  i++) {
            int chocolatePiece = barArray[i];
            currentSum+= chocolatePiece;
            currentNumberOfSquares++;

            if (currentSum <= intendedSum && currentNumberOfSquares <= intendedNumberOfSquares) {
                if (currentNumberOfSquares == intendedNumberOfSquares){
                    if (currentSum == intendedSum){
                        numberOfWaysToSum++ ;
                    }
                    currentNumberOfSquares-- ;
                    currentSum = currentSum - barArray[i-intendedNumberOfSquares+1];
                }
            } else if (currentNumberOfSquares == intendedNumberOfSquares){
                currentNumberOfSquares--;
                currentSum = currentSum - barArray[i-intendedNumberOfSquares+1];

            }

        }


        return numberOfWaysToSum;
    }

    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        int sizeOfChocolateBar = in.nextInt();
        int[] s = new int[sizeOfChocolateBar];
        for(int s_i=0; s_i < sizeOfChocolateBar; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(sizeOfChocolateBar, s, d, m);
        System.out.println(result);


    }
}
