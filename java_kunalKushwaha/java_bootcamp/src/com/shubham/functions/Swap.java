package com.shubham.functions;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int a, b;
        System.out.print("Enter a: ");
        a = con.nextInt();
        System.out.print("Enter b: ");
        b = con.nextInt();
        mySwap(a, b);  //JAVA is always pass by value
//        for primitive data types, new object is created by the value passed...
//        so value change is not reflected outside the new scope
        System.out.println("a= " + a + " b= " + b + " inside main()");

//        objects
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.print("arr = " + arr + " arr before value change: " );
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        changeValue(arr);
//        for objects & references, value of the reference variable (ie, address) is passed
//        so value changes made in new scope is reflected in the original scope
        System.out.print("arr= " + arr + " arr after value change: ");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void mySwap(int a, int b) {
        int t=a;
        a=b;
        b=t;
        System.out.println("a= " + a + " b= " + b + " inside mySwap()");
    }

    static void changeValue(int[] nums) {
        nums[0] = 90;
        System.out.println("Inside changeValue(), nums= " + nums);
    }
}
