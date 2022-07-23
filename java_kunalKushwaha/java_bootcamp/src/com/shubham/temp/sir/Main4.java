package com.shubham.temp.sir;

import java.util.Scanner;

public class Main4 {

    static boolean isPerfect(int n) {
        int sum = 0;
        for (int i=1; i<n; i++) {
            if (n%i == 0) {
                sum += i;
            }
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int n = con.nextInt();
        if (isPerfect(n)) {
            System.out.println("Given number is a Perfect number");
        }else {
            System.out.println("Given number is not a Perfect number");
        }
    }
}
