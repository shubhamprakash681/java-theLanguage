package com.shubham.conditionalsAndLoops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int n;
        System.out.println("Enter no. of terms: ");
        n = con.nextInt();
        int t1=0, t2=1;
        System.out.print(t1 + " " + t2);
        for (int i=3; i<=n; i++) {
            int b=t2;
            t2 = t2+t1;
            System.out.print(" " + t2);
            t1 = b;
        }
    }
}
