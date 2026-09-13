import java.util.*;

public class Kaprekar {
    Scanner sc = new Scanner(System.in);
    int n, sq, s, d, div, f, sec, m; // declaring vars

    Kaprekar() { // constructor for initializing vars
        n = 0;
        sq = 0;
        s = 0;
        div = 0;
        f = 0;
        sec = 0;
        m = 0;
    }

    void accept() { // accepting from user
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        System.out.println("Enter a another number:");
        m = sc.nextInt();
    }

    void calc() {
        sq = n * n;
        d = String.valueOf(sq).length(); // converting the sq into string then taking the lenth of it (eg. sq=2025, d=4)
        div = (int) Math.pow(10, d / 2); // determining the divisor (eg. d=4, then div=10^(4/2)=100)
        f = sq / div;
        sec = sq % div;
        s = f + sec; // storing the sum of the two halves
    }

    void display() {
        if (n == s) { // if number is equal to sum then karprekar
            System.out.println("Karprekar");
            System.out.println("Kaprekar Numbers between " + n + " and " + (n + m));
            for (int i = n + 1; i <= n + m; i++) {
                n = i;
                calc(); // checks every number between n and n+m for karprekar and if yes then prints it
                if (n == s) {
                    System.out.println(n);
                }
            }
        } else {
            System.out.println("Not Karprekar");
        }
    }

    public static void main(String[] args) {
        Kaprekar obj = new Kaprekar(); // calling method functions
        obj.accept();
        obj.calc();
        obj.display();
    }
}
