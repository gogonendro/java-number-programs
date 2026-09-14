import java.util.*;

public class Magic {
    Scanner sc = new Scanner(System.in);
    int n;

    Magic() {
        n = 0;
    }

    boolean isMag(int x) {
        int d = 0;
        int s = 0;
        while (x > 9) { // run till x becomes single digit
            int t = x; // temp var stores x
            s = 0; // reset sum
            while (t != 0) { // digit extract and add
                d = t % 10;
                s = s + d;
                t = t / 10;
            }
            x = s; // put sum in x and repeat the process
        }
        return x == 1; // return whether the final outcome is 1
    }

    void acc_calc() {
        System.out.println("Enter a number:");
        n = sc.nextInt();

        boolean found = false;
        if (isMag(n)) {
            System.out.println(n + " is Magic");
            found = true;
        }
        if (!found) {
            System.out.println(n + " is not Magic");
        }
    }

    public static void main(String[] args) {
        Magic obj = new Magic();
        obj.acc_calc();
        obj.sc.close();
    }
}
