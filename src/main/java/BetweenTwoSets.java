import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ursus on 6/4/2017.
 */
public class BetweenTwoSets {


    static int getTotalX(int[] a, int[] b) {
        int start =  a[a.length - 1];
        int end =  b[0];

        Arrays.sort(a);
        Arrays.sort(b);

        int counterOfNumbersBetween = 0;
        for (int i = start; i <= end; i++) {
            boolean modAClean = true;
            for (int element : a) {

                if (i % element != 0) {
                    modAClean = false;
                    break;
                }
            }
            if (modAClean) {
                boolean modBClean = true;
                for (int element : b) {
                    if (element % i != 0) {
                        modBClean = false;
                        break;
                    }
                }
                if (modBClean) {
                    counterOfNumbersBetween++;

                }
            }
        }
        return counterOfNumbersBetween;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for (int b_i = 0; b_i < m; b_i++) {
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
    }
}


