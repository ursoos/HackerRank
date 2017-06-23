import java.util.Scanner;

/**
 * Created by Ursus on 6/23/2017.
 * https://www.hackerrank.com/challenges/drawing-book
 *
 */
public class DrawingBook {

    static int solve(int numberOfPages, int pageToTurn){

        int pageTurnsFromFirst = pageToTurn / 2 ;

        int pageTurnsFromEnd = numberOfPages / 2 - pageToTurn / 2 ;

        return (pageTurnsFromFirst < pageTurnsFromEnd ? pageTurnsFromFirst: pageTurnsFromEnd);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
