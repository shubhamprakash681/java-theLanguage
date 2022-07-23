package pattern.advancedPattern.homework;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int r = con.nextInt();
        for (int i=1; i<=r; i++) {
            for (int j=1; j<=r-i; j++) {
                System.out.print("  ");
            }
            for (int j=0; j<i; j++) {
                System.out.print("  " + nCr(i, j));
            }
            System.out.println();
        }
    }

    static int nCr(int n, int r) {
        return fact(n)/(fact(r)*fact(n-r));
    }

    static int fact(int n) {
        int r=1;
        for (int i=2; i<=n; i++) {
            r*=i;
        }
        return r;
    }
}
