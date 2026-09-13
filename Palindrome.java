import java.util.*;

public class Palindrome {
    Scanner sc = new Scanner(System.in);

    int n, d, t, rev; // declare var

    Palindrome() { // constructor to initialize var
        n = 0;
        d = 0;
        t = 0;
        rev = 0;
    }

    void accept() {
        System.out.println("Enter a number:"); // accept number from user
        n = sc.nextInt();
        t = n; // make a temporary copy of the number
    }

    void calc() {
        while (t != 0) {
            d = t % 10; // extract the last digit
            rev = (rev * 10) + d; // add the digit to the reverse
            t = t / 10; // remove the last digit
        }
    }

    void display() { // check for palindrome
        if (n == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome(); // call func methods

        obj.accept();
        obj.calc();
        obj.display();
    }
}