import java.util.*;

public class Duck {
    Scanner sc = new Scanner(System.in);
    int n;// declare var

    Duck() {
        n = 0; // initialize var in constructor
    }

    boolean isDuck(int x) { // check for duck
        int t = x;
        int d = 0;
        while (t != 0) {
            d = t % 10;
            if (d == 0) {
                return true; // returns true if d = 0
            }
            t = t / 10;
        }
        return false; // otherwise false
    }

    void acc_calc() {
        System.out.println("Enter a number:");
        n = sc.nextInt(); // accept number from user
        char d1 = String.valueOf(n).charAt(0);
        if (isDuck(n)) {
            if (d1 == '0') { // check if first digit is 0
                System.out.println(n + " is not Duck");
            } else {
                System.out.println(n + " is Duck");
            }
        } else {
            System.out.println(n + " is not Duck");
        }
    }

    public static void main(String[] args) {
        Duck obj = new Duck(); // call method funcs
        obj.acc_calc();
        obj.sc.close();
    }
}
