package com.shubham.basics;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int rollNo = con.nextInt();
        System.out.println("Your roll no is: " + rollNo);
        int a = 234_000_000;  //as int
        System.out.println(a);
        double b = 234e6;  //as double
        System.out.println(b);

        System.out.println("Enter a beautiful sentence: ");
        con.nextLine();
        String line = con.nextLine();
        System.out.println(line);

        System.out.println("Enter your marks: ");
        float marks = con.nextFloat();
        System.out.println("Your marks is: " + marks);
    }
}
