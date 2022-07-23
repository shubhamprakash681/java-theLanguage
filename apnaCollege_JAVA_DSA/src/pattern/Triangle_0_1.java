package pattern;

import java.util.Scanner;
//note:- imp.observation---if ((i+j)%2==0)->1,  else ->0
public class Triangle_0_1 {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int r = con.nextInt();
        boolean b = true;
        for (int i=1; i<=r; i++) {
            for (int j=1; j<=i; j++) {
                if(b) {
                    System.out.print(1);
                }else {
                    System.out.print(0);
                }
                b=!b;
            }
            if (i%2==0) {
                b=!b;
            }
            System.out.println();
        }
    }
}
