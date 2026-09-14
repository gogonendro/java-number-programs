import java.util.*;

public class Disarium {
    Scanner sc = new Scanner(System.in);
    int n, d, t, p; // declare vars
    double len, s;

    Disarium() { // constructor to initialize vars
        n = 0;
        len = 0;
        d = 0;
        t = 0;
        s = 0;
        p = 0;
    }

    void accept() { // accept input from user
        System.out.println("Enter a number:");
        n = sc.nextInt();
        t = n; // store input temporarily in t
    }

    void calc() {
        len = String.valueOf(t).length(); // calculate the number of digits
        p = (int) len; // convert it into length

        while (t != 0) { // calculate sum
            d = t % 10;
            s = s + Math.pow(d, p); // raises digits from the right to the power of its place
            t = t / 10;
            p--; // reduces the power by one after each iteration
        }
    }

    void display() { // check for disarium
        if (s == n) {
            System.out.println(n + " is Disarium");
        } else {
            System.out.println(n + " is not Disarium");
        }
    }

    public static void main(String[] args) {
        Disarium obj = new Disarium(); // call func methods
        obj.accept();
        obj.calc();
        obj.display();
    }
}
