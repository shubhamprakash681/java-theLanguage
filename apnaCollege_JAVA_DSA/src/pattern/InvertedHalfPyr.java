package pattern;

import java.util.Scanner;

public class InvertedHalfPyr {
//    mirror image of HalfPyr pattern about x-axis
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int r = con.nextInt();
        int c=r;
        for (int i=1; i<=r; i++) {
            for (int j=1; j<=c; j++) {
                System.out.print("*");
            }
            c--;
            System.out.println();
        }
    }
}
