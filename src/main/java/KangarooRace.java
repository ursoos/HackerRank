import java.util.Scanner;

/**
 * Created by Ursus on 6/3/2017.
 */
public class KangarooRace {
    private Kangaroo closer, farther;

    public static void main(String[] args) {

        KangarooRace myInstance = new KangarooRace();

        myInstance.readInput();
        String answer = myInstance.calculate();
        System.out.println(answer);
    }

    private String calculate() {

        if (farther.speed > closer.speed)
            return "NO";

        int previousDistance = farther.pos - closer.pos;

        while (true) {

            closer.move();
            farther.move();


            if (closer.pos == farther.pos)
                return "YES";

            int distance = farther.pos - closer.pos;

            if (distance >= previousDistance) {
                return "NO";
            } else {

                previousDistance = distance;
            }
        }

    }

    class Kangaroo {
        int speed, pos;

        Kangaroo(int x, int v) {
            this.speed = v;
            this.pos = x;
        }

        void move() {
            pos += speed;
        }
    }

    private void readInput() {
        Scanner in = new Scanner(System.in);
        closer = new Kangaroo(in.nextInt(), in.nextInt());
        farther = new Kangaroo(in.nextInt(), in.nextInt());
    }
}


