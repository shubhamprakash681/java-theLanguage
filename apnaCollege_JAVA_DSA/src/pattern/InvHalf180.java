package pattern;

import java.util.Scanner;

public class InvHalf180 {
    public static void main(String[] args) {
//        inv. half pyr. rotated by 180 deg.
        Scanner con = new Scanner(System.in);
        int r = con.nextInt();
        for (int i=1; i<=r; i++) {
            for (int j=1; j<=r; j++) {
                if (j<=r-i) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
