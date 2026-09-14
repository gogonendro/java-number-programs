import java.util.*;

public class Neon {
    Scanner sc = new Scanner(System.in);
    int n, d, sq, t, s, m;

    Neon() {
        n = 0;
        sq = 0;
        d = 0;
        t = 0;
        s = 0;
        m = 0;
    }

    void accept() {
        System.out.println("Enter a number:");
        n = sc.nextInt();
        System.out.println("Enter another number:");
        m = sc.nextInt();
    }

    void isNeon() {
        sq = n * n;
        t = sq;
        s = 0;
        while (t != 0) {
            d = t % 10;
            s = s + d;
            t = t / 10;
        }
    }

    void display() {
        if (n == s) {
            System.out.println(n + " is Neon");
            System.out.println("Neon numbers from " + n + " to " + (n + m) + " are: ");
            for (int i = n + 1; i < n + m; i++) {
                n = i;
                isNeon();
                if (s == n) {
                    System.out.println(n);
                }
            }
        } else {
            System.out.println(n + " is not Neon");
        }
    }

    public static void main(String[] args) {
        Neon obj = new Neon();
        obj.accept();
        obj.isNeon();
        obj.display();
    }
}
