import java.util.*;;

public class Spy {
    Scanner sc = new Scanner(System.in);
    int n, d, s, p, t; // declare vars

    Spy() { // constructor to initialize vars
        n = 0;
        d = 0;
        s = 0;
        p = 1;
        t = 0;
    }

    void accept() {
        System.out.println("Enter a number:");
        n = sc.nextInt(); // accept input from user
        t = n; // copy input in t
    }

    void calc() { // calculate the sum and the product of digits
        while (t != 0) {
            d = t % 10;
            s = s + d;
            p = p * d;
            t /= 10;
        }
    }

    void display() {
        if (s == p) { // check for spy
            System.out.println(n + " is Spy Number");
        } else {
            System.out.println(n + " is not Spy Number");
        }
    }

    public static void main(String[] args) {
        Spy obj = new Spy(); // call func methods
        obj.accept();
        obj.calc();
        obj.display();
    }
}
