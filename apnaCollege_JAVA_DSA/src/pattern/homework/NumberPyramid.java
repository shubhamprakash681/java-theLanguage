package pattern.homework;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int r = con.nextInt();
        for (int i=1; i<=r; i++) {
            for (int j=1; j<=r-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
