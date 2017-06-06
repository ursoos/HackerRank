import java.util.HashMap;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/migratory-birds?h_r=next-challenge&h_v=zen
 * Created by Ursus on 6/6/2017.
 */
public class MigratoryBirds {
    public static void main (String [] args ){

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int [] flock = new int [size];
        for (int i = 0; i < flock.length; i++){
            flock[i] = input.nextInt();
        }

        System.out.println(compute(flock));
    }

    public static int compute(int[] flock) {
        HashMap<Integer, Integer> types = new HashMap<Integer, Integer>();

        int [] typesCounter = new int [6];

        for (int bird : flock){
            typesCounter[bird] +=1 ;
        }

        int highestTypeCountIndex = 0 ;
        int highestTypeCount = -1 ;
        for (int i = 0 ; i< typesCounter.length; i++) {
            if (typesCounter[i]>highestTypeCount){
                highestTypeCount = typesCounter[i];
                highestTypeCountIndex = i ;
            }

        }

        return highestTypeCountIndex;


    }

}
