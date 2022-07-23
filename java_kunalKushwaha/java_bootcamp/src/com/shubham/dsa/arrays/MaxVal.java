package com.shubham.dsa.arrays;

import java.util.Scanner;

public class MaxVal {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0; i<5; i++) {
            arr[i] = con.nextInt();
        }
        int max = arr[0];
        for (int i=0; i<arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        System.out.println(max);
    }
}
