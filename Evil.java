import java.util.*;

public class Evil {
    Scanner sc = new Scanner(System.in);
    int n;

    Evil() {
        n = 0;
    }

    boolean isEvil(int x) {
        int d = x; // temporary store number in d
        String b = ""; // b is string because we need to concatenate
        int c = 0; // set counter to 0
        while (d > 0) {
            int r = d % 2; // find the remainder
            b = b + r; // concat it to b
            if (r == 1) {
                c++; // increase counter by 1 when '1' is found
            }
            d = d / 2;
        }
        return c % 2 == 0; // returns whether number of '1's are even
    }

    void acc_calc() {
        System.out.println("Enter a number:");
        n = sc.nextInt();

        boolean found = false;
        if (isEvil(n)) {
            System.out.println(n + " is Evil");
            found = true;
        }
        if (!found) {
            System.out.println(n + " is not Evil");
        }
    }

    public static void main(String[] args) {
        Evil obj = new Evil();
        obj.acc_calc();
        obj.sc.close();
    }
}
