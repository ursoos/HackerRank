

import java.util.Scanner;

/**
 * Created by piotr_000 on 4/27/2017.
 */
public class Division {

    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int i=0; i < n; i++){

           grades[i] = in.nextInt();
            int mod5 = grades[i]% 5;

            if (grades[i] < 38) {
                System.out.println(grades[i]);
            } else if (5-mod5 <3) {


                System.out.println(grades[i]+5-mod5 );
            } else {
                System.out.println(grades[i]);
            }

        }



    }
}
