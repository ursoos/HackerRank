import java.util.Scanner;

/**
 * Created by Ursus on 6/6/2017.
 */
public class DivisibleSumPairs {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }



    }
    public static int solve(int divisor, int [] input) {
        int numberOfPairs = 0;
        for (int i = 0; i< input.length; i++){
            for (int j = i+1; j < input.length; j++){
                if ((input[i] + input[j]) % divisor == 0  ) {
                    numberOfPairs++;
                }
            }
        }

        return numberOfPairs;
    }

}
