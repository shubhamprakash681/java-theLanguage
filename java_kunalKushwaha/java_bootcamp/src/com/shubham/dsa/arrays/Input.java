package com.shubham.dsa.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
//        array of primitives
        Scanner con = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0; i<arr.length; i++) {
            arr[i] = con.nextInt();
        }
        for (int j : arr) { //enhanced for loop
            System.out.print(j + " ");
        }
        System.out.println(Arrays.toString(arr));
        
        
//        array of objects
        String[] str = new String[5];
        for (int i=0; i<str.length; i++) {
            str[i] = con.next();
        }
        System.out.println(Arrays.toString(str));

        int[] nums = {2, 4,3, 454, 4};
        System.out.println(Arrays.toString(nums));
        changeArrayElements(nums);  //mutable
        System.out.println(Arrays.toString(nums));

//        note:- strings are immutable..


//        multi-dimension arrays:
//        2-D arrays:-
        int[][] ar = new int[3][4]; //adding no. of rows is mandatory, but no. of columns is not mandatory
        // so individual size of each array can vary
        System.out.println(Arrays.toString(ar));
        for (int i=0; i<ar.length; i++) {
            System.out.println(Arrays.toString(ar[i]));  //all 0
        }
//      input
        for (int i=0; i<ar.length; i++) {
            for (int j=0; j<ar[i].length; j++) {
                ar[i][j] = con.nextInt();
            }
        }
//        output
        for (int i=0; i<ar.length; i++) {
            System.out.println(Arrays.toString(ar[i]));  //all 0
        }
    }

    static void changeArrayElements(int[] arr) {
        arr[0] = 99;
    }
}
