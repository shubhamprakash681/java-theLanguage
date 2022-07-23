package pattern;

import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int r = con.nextInt();
        int c = 1;
        for (int i=1; i<=r; i++) {
            for (int j=1; j<=c; j++) {
                System.out.print("*");
            }
            c++;
            System.out.println();
        }
    }
}
