import java.util.*;

public class Strong {
    Scanner sc = new Scanner(System.in);
    int n;

    Strong() {
        n = 0;
    }

    boolean isStrong(int x) {
        int t = x;
        int s = 0;
        int f = 1;
        // int l = String.valueOf(t).length();
        while (t != 0) {
            int d = t % 10; // extract last digit
            f = 1; // reset f to 1
            for (int i = d; i > 0; i--) { // loop runs from d to 1
                f = f * i; // each digit is multiplied with f
            }
            s = s + f; // add the f to sum
            t = t / 10; // remove last digit
        }
        return s == x; // returns whether sum is equal to original number
    }

    void acc_calc() {
        System.out.println("Enter a number:");
        n = sc.nextInt();

        boolean found = false;
        if (isStrong(n)) {
            System.out.println(n + " is Strong");
            found = true;
        }
        if (!found) {
            System.out.println(n + " is not Strong");
        }
    }

    public static void main(String[] args) {
        Strong obj = new Strong();
        obj.acc_calc();
        obj.sc.close();
    }
}
