import java.util.*;

public class Perfect {
    Scanner sc = new Scanner(System.in);
    int n, d, s; // declare vars

    Perfect() { // constructor to initialize vars
        n = 0;
        d = 0;
        s = 0;
    }

    void accept() {
        System.out.println("Enter a number:");
        n = sc.nextInt(); // accept number from user
    }

    void calc() { // calculate the sum of factors
        s = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                s = s + i;
            }
        }
    }

    void display() { // check for perfect
        if (s == n) {
            System.out.println(n + " is Perfect");
        } else {
            System.out.println(n + " is not Perfect");
        }
    }

    public static void main(String[] args) {
        Perfect obj = new Perfect(); // call func methods
        obj.accept();
        obj.calc();
        obj.display();
    }
}
