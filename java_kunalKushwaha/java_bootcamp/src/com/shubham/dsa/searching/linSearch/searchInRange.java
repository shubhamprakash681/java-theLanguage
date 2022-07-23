package com.shubham.dsa.searching.linSearch;

import java.util.Scanner;

public class searchInRange {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int n = con.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = con.nextInt();
        }
        int s= con.nextInt();
        int e = con.nextInt();
        int k = con.nextInt();
        System.out.println(linSearchInRange(arr, s, e, k));

    }

    static int linSearchInRange(int[] arr, int s, int e, int key) {
        for (int i=s; i<=e; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
