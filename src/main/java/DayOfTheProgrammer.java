import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/day-of-the-programmer?h_r=next-challenge&h_v=zen
 * Created by Ursus on 6/6/2017.
 */
public class DayOfTheProgrammer {

    static String solve(int year){
        String output = "";

        if (year >= 1700 && year < 1918 ) {
            output = solveJuli(year);
        } else if (year > 1918){
            output = solveGregorian(year);
        } else if (year == 1918){
            return "26.09.1918";
        }

        return output;
    }

    private static String solveJuli(int year) {

        if (year % 4 == 0 ) {
            return "12.09."+year;
        } else {
            return "13.09."+year;
        }
    }
    private static String solveGregorian(int year) {

        if ((year % 4 == 0 && year % 100 != 0  ) || (year % 400 == 0)) {
            return "12.09."+year;
        } else {
            return "13.09."+year;
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }

}
