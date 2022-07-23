package com.shubham.basics;

import java.util.Scanner;


//Conditions for automatic type conversion:-
//1. Two types should be compatible
//2. Destination type > Source type

//Type-casting is done mannually(explicitely)

public class TypeCasting {
    public static void main(String[] args) {
//        automatic type-conversion:-
        System.out.println("Enter a number: ");
        Scanner con = new Scanner(System.in);
        float num = con.nextFloat();  //asking for float..it will work if we give int....But vice-versa is not true
        System.out.println(num);

//        type-casting explicitly:-
        int i = (int)(543.78f);
        System.out.println(i);

//        automatic type-promotion in expression:-
        int a = 260;
        byte b = (byte)a;   //260%256  (since byte can go max. up-to 256
        System.out.println(b);
        byte b1 = 40;
        byte b2 = 50;
        byte b3 = 100;
        int d = (b1*b2)/b3; //while doing (b1*b2), result 2000 exceeds the max. limit of byte
        // so the result is automatically promoted to an integer
        System.out.println(d);

        int n1 = 'A';  //automatic type-conversion to int
        System.out.println(n1);

//        JAVA follows unicode principles
        System.out.println("नमस्ते");
        System.out.println("ہیلو");
    }
}

