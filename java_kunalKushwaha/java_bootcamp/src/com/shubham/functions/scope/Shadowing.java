package com.shubham.functions.scope;

public class Shadowing {
    //    shadowing s the practice of using 2 variables with the same name within overlapping scope
    static int x=90;

    public static void main(String[] args) {
        System.out.println(x);  //90
        printX();   //90

        int x = 67;
        System.out.println(x);  //67
        printX();  //90 -> b/c x is not changed inside printX() scope
        {
//            int x = 98; //error
            x  = 98;
            System.out.println(x);  //98
        }
        printX();  //90 -> b/c x is not changed inside printX() scope
    }

    static void printX() {
        System.out.println("Inside printX(), x= " + x);
    }
}
