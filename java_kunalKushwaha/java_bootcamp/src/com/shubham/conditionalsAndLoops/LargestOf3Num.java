package com.shubham.conditionalsAndLoops;

import java.util.Scanner;

public class LargestOf3Num {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int a, b, c;

        System.out.println("Enter three numbers: ");
        a = con.nextInt();
        b = con.nextInt();
        c = con.nextInt();
        int res = a;
        if (b>res) {
            res = b;
        }if (c>res) {
            res = c;
        }
        System.out.println("Maximum of the three entered numbers is: "+res);
    }
}
