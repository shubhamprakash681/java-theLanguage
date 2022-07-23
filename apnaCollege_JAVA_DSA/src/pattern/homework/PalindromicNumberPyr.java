package pattern.homework;

import java.util.Scanner;

public class PalindromicNumberPyr {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int r = con.nextInt();
        for (int i=1; i<=r; i++) {
            for (int j=1; j<=2*(r-i); j++) {
                System.out.print(" ");
            }
            int num = i;
            for (int j=1; j<2*i; j++) {
                System.out.print(num + " ");
                if (j<i) {
                    num--;
                }else {
                    num++;
                }
            }
            System.out.println();
        }
    }
}
