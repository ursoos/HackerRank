import java.util.Scanner;

/**
 * Created by Ursus on 6/4/2017.
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records?h_r=next-challenge&h_v=zen
 */

public class BreakingTheRecords{

        static int[] getRecord(int[] s){
            int lowestScore = s[0];
            int highestScore = lowestScore;
            int lowestRecordCounter = 0 ;
            int highestRecordCounter = 0 ;


            for (int gameScore : s) {
                if (gameScore > highestScore) {
                    highestRecordCounter++;
                    highestScore = gameScore;
                }
                if (gameScore < lowestScore) {
                    lowestRecordCounter++;
                    lowestScore = gameScore;
                }

            }
            return new int [] {highestRecordCounter,lowestRecordCounter} ;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] s = new int[n];
            for(int s_i=0; s_i < n; s_i++){
                s[s_i] = in.nextInt();
            }
            int[] result = getRecord(s);
            String separator = "", delimiter = " ";
            for (Integer val : result) {
                System.out.print(separator + val);
                separator = delimiter;
            }
            System.out.println("");
        }
}
