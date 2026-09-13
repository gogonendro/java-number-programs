import java.util.*;

public class Automorphic {
    Scanner sc = new Scanner(System.in);
    int n, sq, k, t; // declare vars
    // double len;

    Automorphic() { // constructor to initialize vars
        n = 0;
        sq = 0;
        // len = 0;
        k = 1;
        t = 0;
    }

    void accept() {
        System.out.println("Enter a number:");
        n = sc.nextInt(); // accept input from user
        t = n; // store the original number in t
    }

    void calc() {
        k = 1;
        // len = String.valueOf(n).length(); // find the number of digits in n
        sq = n * n;

        while (n > 0) {
            if (n % 10 != sq % 10) { // check for same digit from the end
                k = 0;
            }
            n /= 10; // remove last digits
            sq /= 10;
        }
    }

    void display() {
        if (k == 0) { // check for automorphic
            System.out.println(t + " is not Automorphic");
        } else {
            System.out.println(t + " is Automorphic");
        }
    }

    public static void main(String[] args) {
        Automorphic obj = new Automorphic(); // call func methods
        obj.accept();
        obj.calc();
        obj.display();
    }
}