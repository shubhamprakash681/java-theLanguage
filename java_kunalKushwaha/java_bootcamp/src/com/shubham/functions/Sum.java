package com.shubham.functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        System.out.print("Enter no. of test cases: ");
        int t=con.nextInt();
        while (t-- > 0) {
            mySum();
        }
    }

    static void mySum() {
        Scanner con = new Scanner(System.in);
        System.out.print("Enter a, b: ");
        int a = con.nextInt();
        int b = con.nextInt();
        int c = a+b;
        System.out.println("Sum of " + a + " and " + b + " is " + c);
    }
}
