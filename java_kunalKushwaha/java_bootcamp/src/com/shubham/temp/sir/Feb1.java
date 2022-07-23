package com.shubham.temp.sir;

import java.util.Scanner;

public class Feb1 {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int n = con.nextInt();
        int oS=0;
        int eS=0;
        int bkp=n;

        while (bkp > 0) {
            oS+=(bkp%10);
            bkp/=100;
        }
        n/=10;
        while (n > 0) {
            eS+=(n%10);
            n/=100;
        }

        if (oS == eS) {
            System.out.println("Sum are equal");

        }else {
            System.out.println("Sum are not equal");

        }
    }
}
