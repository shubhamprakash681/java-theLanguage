package com.shubham.conditionalsAndLoops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        char ch;
//        System.out.println(con.next().trim().charAt(0));
        System.out.println("Enter a character: ");
        ch = con.next().trim().charAt(0);
        if (ch>='a' && ch<='z') {

            System.out.println("Lower case");
        }else if (ch>='A' && ch <= 'Z') {
            System.out.println("Upper Case");
        }else {
            System.out.println("Invalid Entry");
        }
    }
}
