import java.util.*;

public class Neon {
    Scanner sc = new Scanner(System.in);
    int n, m; // declare var

    Neon() { // constructor to intialize vars
        n = 0;
        m = 0;
    }

    boolean isNeon(int x) { // check for neon
        int sq = x * x;
        int sum = 0;
        int t = sq;

        while (t != 0) {
            int d = t % 10;
            sum = sum + d;
            t = t / 10;
        }
        return (sum == x); // returns whether a number is neon by true or false
    }

    void accept_calc() { // accept number and calculate
        System.out.println("Enter a number:");
        n = sc.nextInt();

        if (isNeon(n)) {
            System.out.println(n + " is Neon");
            System.out.println("Enter another number:");
            m = sc.nextInt();

            boolean found = false; // default set to false
            System.out.println("Neon numbers between " + n + " and " + (n + m) + " are: ");
            for (int i = n + 1; i < n + m; i++) {
                if (isNeon(i)) {
                    System.out.println(i);
                    found = true; // change found to true when neon is found
                }
            }
            if (!found) { // when not found print the message
                System.out.println("No Neon numbers between " + n + " and " + (n + m) + " present");
            }
        } else {
            System.out.println(n + " is not Neon");
        }
    }

    /*
     * void isNeon() {
     * sq = n * n;
     * t = sq;
     * s = 0;
     * while (t != 0) {
     * d = t % 10;
     * s = s + d;
     * t = t / 10;
     * }
     * }
     */

    /*
     * void display() {
     * if (n == s) {
     * System.out.println(n + " is Neon");
     * System.out.println("Neon numbers from " + n + " to " + (n + m) + " are: ");
     * for (int i = n + 1; i < n + m; i++) {
     * n = i;
     * isNeon();
     * if (s == n) {
     * System.out.println(n);
     * }
     * }
     * } else {
     * System.out.println(n + " is not Neon");
     * }
     * }
     */

    public static void main(String[] args) {
        Neon obj = new Neon(); // call method funcs
        obj.accept_calc();
    }
}
