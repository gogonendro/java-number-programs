import java.util.*;

public class Happy {
    Scanner sc = new Scanner(System.in);
    int n;

    Happy() {
        n = 0;
    }

    boolean isHap(int x) {
        int d = 0;
        int s = 0;
        while (x != 1 && x != 4) { /*
                                    * continue until x becomes 1 or reaches 4.
                                    * a happy number eventually reaches 1.
                                    * an unhappy number eventually enters a cycle containing 4.
                                    */
            int t = x; // temp var stores x
            s = 0; // reset sum
            while (t != 0) { // digit extract and add
                d = t % 10;
                s = s + (int) Math.pow(d, 2);
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
        if (isHap(n)) {
            System.out.println(n + " is Happy");
            found = true;
        }
        if (!found) {
            System.out.println(n + " is not Happy");
        }
    }

    public static void main(String[] args) {
        Happy obj = new Happy();
        obj.acc_calc();
        obj.sc.close();
    }
}