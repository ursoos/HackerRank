/**
 * Created by Ursus on 5/12/2017.
 */


import java.util.Scanner;

public class AppleAndOrange {
    private int s;
    private int t;
    private int a;
    private int b;
    private int applesOnHouse;
    private int orangesOnHouse;
    private int[] apple;
    private int[] orange;

    public static void main(String[] args) {

        AppleAndOrange myInstance = new AppleAndOrange();
        myInstance.readInput();
        myInstance.calculate();
        System.out.println(myInstance.applesOnHouse);
        System.out.println(myInstance.orangesOnHouse);
    }

    private void calculate() {
        applesOnHouse = calculateFruit(a, apple);
        orangesOnHouse = calculateFruit(b, orange);
    }

    private int calculateFruit(int treeLocation, int[] distances) {
        int landed = 0;

        for (int landingDistance : distances) {
            int placeLanded = treeLocation + landingDistance;
            if (placeLanded >= s && placeLanded <= t) {
                landed++;
            }
        }
        return landed;
    }

    private void readInput() {
        Scanner in = new Scanner(System.in);
        s = in.nextInt();
        t = in.nextInt();
        a = in.nextInt();
        b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        apple = new int[m];
        for (int apple_i = 0; apple_i < m; apple_i++) {
            apple[apple_i] = in.nextInt();
        }
        orange = new int[n];
        for (int orange_i = 0; orange_i < n; orange_i++) {
            orange[orange_i] = in.nextInt();
        }
    }
}
