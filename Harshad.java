import java.util.*;

public class Harshad {
    Scanner sc = new Scanner(System.in);
    int n, m;

    Harshad() {
        n = 0;
        m = 0;
    }

    boolean isHarshad(int x) {
        int sum = 0;
        int t = x;
        while (t != 0) {
            int d = t % 10;
            sum = sum + d;
            t = t / 10;
        }

        return x % sum == 0;
    }

    void acc_calc() {
        System.out.println("Enter a number:");
        n = sc.nextInt();

        if (isHarshad(n)) {
            System.out.println(n + " is Harshad");
            System.out.println("Enter another number:");
            m = sc.nextInt();

            boolean found = false;
            System.out.println("Harshad numbers between " + n + " and " + (n + m) + " are:");
            for (int i = n + 1; i < n + m; i++) {
                n = i;
                if (isHarshad(i)) {
                    System.out.println(i);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No Harshad numbers between " + n + " and " + (n + m));
            }
        } else {
            System.out.println(n + " is not Harshad");
        }
    }

    public static void main(String[] args) {
        Harshad obj = new Harshad();
        obj.acc_calc();
    }
}
