import java.util.*;

public class Fascinating {
    Scanner sc = new Scanner(System.in);
    int n;

    Fascinating() {
        n = 0;
    }

    boolean isFasc(int x) {
        int d = 0;
        int t = 0;
        int c = 0;

        int p2 = x * 2;
        int p3 = x * 3;
        int concat = (x + 1000000) + (p2 * 1000) + (p3);

        for (int i = 1; i < 10; i++) {
            t = concat;
            while (t > 0) {
                d = t % 10;
                if (d == i) {
                    c++;
                }
                t = t / 10;
            }
        }
        return c > 1;
    }

    void acc_calc() {
        System.out.println("Enter a number:");
        n = sc.nextInt();

        boolean found = false;
        if (isFasc(n)) {
            System.out.println(n + " is Fascinating");
            found = true;
        }
        if (!found) {
            System.out.println(n + " is not Fascinating");
        }
    }

    public static void main(String[] args) {
        Fascinating obj = new Fascinating();
        obj.acc_calc();
    }
}
