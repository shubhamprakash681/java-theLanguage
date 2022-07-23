package pattern;

import java.util.Scanner;

public class HollowRect {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int r = con.nextInt();
        int c = con.nextInt();
        for (int i=1; i<=r; i++) {
            for (int j=1; j<=c; j++) {
                if (i==1 || i==r) {
                    System.out.print("*");
                }else {
                    if (j==1 || j==c) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }
    }
}
