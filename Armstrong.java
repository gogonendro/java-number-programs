import java.util.*;

public class Armstrong {
    Scanner sc = new Scanner(System.in);
    int n, d, len, t; // declare var
    double sum;

    Armstrong() { // constructor to initialize vars
        n = 0;
        d = 0;
        sum = 0;
        len = 0;
        t = 0;
    }

    void accept() {
        System.out.println("Enter a number: "); // accept number from user
        n = sc.nextInt();
        t = n; // store the number temporarily
    }

    void calc() {
        len = String.valueOf(n).length(); // take the number of digits in the number
        sum = 0; // reset sum before calculation
        while (t != 0) {
            d = t % 10; // extract the lst digit
            sum = sum + (Math.pow(d, len)); // add it to sum by raising it to the power of the number of digits
            t = t / 10; // remove the last digit from the number
        }
    }

    void display() {
        if (sum == n) { // check if armstrong
            System.out.println(n + " is Armstrong");
        } else {
            System.out.println(n + " is not Armstrong");
        }
    }

    public static void main(String[] args) {
        Armstrong obj = new Armstrong(); // calling func methods
        obj.accept();
        obj.calc();
        obj.display();
    }
}
