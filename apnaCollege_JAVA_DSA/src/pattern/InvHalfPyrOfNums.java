package pattern;

import java.util.Scanner;

public class InvHalfPyrOfNums {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int r = con.nextInt();
        for (int i=r; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
