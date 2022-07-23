package com.shubham.conditionalsAndLoops;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int num;
        System.out.println("Enter a no.: ");
        num = con.nextInt();
        int n = num, count=0;
        System.out.println("Enter a digit to be counted: ");
        int d = con.nextInt();
        while (n>0) {
            if (n%10 == d) {
                count++;
            }
            n/=10;
        }
        System.out.println("Number of times " + d +" is present in " +num+ " is " + count);
    }
}
