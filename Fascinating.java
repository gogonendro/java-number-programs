import java.util.*;

public class Fascinating {
    Scanner sc = new Scanner(System.in);
    int n; // instance var

    Fascinating() {
        n = 0; // constructor to initialize var
    }

    boolean isFasc(int x) {
        String concat = "" + x + (x * 2) + (x * 3); // concats x, x*2, and x*3
        int count[] = new int[10]; // stores counting for each digit from 1-9
        for (int i = 0; i < concat.length(); i++) {
            int dig = concat.charAt(i) - '0'; // finds digit and converts it to int (eg. '5' -> 5)
            if (dig >= 1 && dig <= 9) {
                count[dig]++; // if digit is between 1 and 9, increase the counter for that digit by 1
            }
        }
        for (int i = 1; i <= 9; i++) {
            if (count[i] != 1) {
                return false; /*
                               * if counter is greater than, or less than 1, returns false, which is necessary
                               * because every digit from 1-9 must occur only once
                               */
            }
        }
        return true;
    }

    void acc_calc() {
        System.out.println("Enter a number:");
        n = sc.nextInt(); // accept number

        boolean found = false; // default false
        if (isFasc(n)) {
            System.out.println(n + " is Fascinating");
            found = true; // true only if fascinating
        }
        if (!found) {
            System.out.println(n + " is not Fascinating");
        }
    }

    public static void main(String[] args) {
        Fascinating obj = new Fascinating(); // call method funcs
        obj.acc_calc();
    }
}
