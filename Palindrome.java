import java.util.*;

public class Palindrome {
    Scanner sc = new Scanner(System.in);

    int n, d, t, rev, m; // declare var
    int start, end; // declare variables for the range

    Palindrome() { // constructor to initialize var
        n = 0;
        d = 0;
        t = 0;
        rev = 0;
        m = 0;
        start = 0;
        end = 0;
    }

    void accept() {
        System.out.println("Enter a number:"); // accept number from user
        n = sc.nextInt();
        System.out.println("Enter another number: ");
        m = sc.nextInt();
        start = n; // store the starting number
        end = n + m; // calculate the ending number
        t = n; // make a temporary copy of the number
    }

    void calc() {
        rev = 0; // reset reverse before reversing a new number
        while (t != 0) {
            d = t % 10; // extract the last digit
            rev = (rev * 10) + d; // add the digit to the reverse
            t = t / 10; // remove the last digit
        }
    }

    void display() { // check for palindrome
        if (n == rev) {
            System.out.println("Palindrome");
            System.out.println("Palindrome numbers between " + start + " and " + end + " are: ");
            for (int i = start + 1; i <= end; i++) {
                t = i; // store the current number in the temporary variable
                calc(); // calculate the reverse of the current number

                if (i == rev) { // check whether the current number is a palindrome
                    System.out.println(i); // display the palindrome number
                }
            }
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