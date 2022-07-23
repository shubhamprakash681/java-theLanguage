package pattern.advancedPattern;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int n = con.nextInt();
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for (int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=(n-i+1); j++) {
                System.out.print("*");
            }
            for (int j=1; j<2*i-1; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
