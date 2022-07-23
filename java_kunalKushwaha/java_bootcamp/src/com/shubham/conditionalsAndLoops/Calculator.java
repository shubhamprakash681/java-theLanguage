package com.shubham.conditionalsAndLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        float num1, num2, res=0;
        boolean invEnt=true;
        char ch;
        while (invEnt) {
            System.out.println("Enter num1: ");
            num1=con.nextFloat();
            System.out.println("Enter num2: ");
            num2 = con.nextFloat();
            System.out.println("Enter '+', '-', '*', '/', '%': ");
            ch = con.next().trim().charAt(0);
            switch (ch) {
                case '+':
                    res = num1+num2;
                    invEnt = false;
                    break;
                case '-':
                    res = num1-num2;
                    invEnt = false;
                    break;
                case '*':
                    res = num1*num2;
                    invEnt = false;
                    break;
                case '/':
                    res = num1/num2;
                    invEnt = false;
                    break;
                case '%':
                    res = num1%num2;
                    invEnt = false;
                    break;
                default:
                    System.out.println("INVALID ENTRY");
            }

        }
        System.out.println("Result = " + res);

    }
}
