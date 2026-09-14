import java.util.*;

public class Fascinating {
    Scanner sc = new Scanner(System.in);
    int n;

    Fascinating() {
        n = 0;
    }

    boolean isFasc(int x) {
        String concat = "" + x + (x * 2) + (x * 3);
        int count[] = new int[10];
        for (int i = 0; i < concat.length(); i++) {
            int dig = concat.charAt(i) - '0';
            if (dig >= 1 && dig <= 9) {
                count[dig]++;
            }
        }
        for (int i = 1; i <= 9; i++) {
            if (count[i] != 1) {
                return false;
            }
        }
        return true;
    }

    void acc_calc() {
        System.out.println("Enter a number:");
        n = sc.nextInt();

        boolean found = false;
        if (isFasc(n)) {
            System.out.println(n + " is Fascinating");
            found = true;
        }
        if (!found) {
            System.out.println(n + " is not Fascinating");
        }
    }

    public static void main(String[] args) {
        Fascinating obj = new Fascinating();
        obj.acc_calc();
    }
}
