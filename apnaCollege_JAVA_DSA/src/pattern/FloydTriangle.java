package pattern;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int r = con.nextInt();
        int num=1;
        for (int i=1; i<=r; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
