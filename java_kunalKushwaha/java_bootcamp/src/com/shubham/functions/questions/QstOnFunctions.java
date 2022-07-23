package com.shubham.functions.questions;

import java.util.Scanner;

public class QstOnFunctions {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        System.out.print("Enter a number: ");
        System.out.println(isPrime(con.nextDouble()));

//        print all 3-digit Armstrong's numbers
        System.out.println("printing all 3-digit Armstrong's numbers: ");
        myArmstrong();
    }

    static boolean isPrime(double n) {
        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    static void myArmstrong() {
        for (int i=100; i<=999; i++) {
            if (isArmStr(i)) {
                System.out.print(i + " ");
            }
        }
    }
    static boolean isArmStr(int num) {
        int s=0;
        int t=num;
        while(t>0) {
            int digit = t%10;
            s+=(digit*digit*digit);
            t/=10;
        }
        return (s==num);
    }
}
