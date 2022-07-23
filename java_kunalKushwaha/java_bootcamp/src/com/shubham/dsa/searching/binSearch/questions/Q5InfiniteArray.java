package com.shubham.dsa.searching.binSearch.questions;

public class Q5InfiniteArray {
    public static void main(String[] args) {
//        Find position of an element in a sorted array of infinite numbers
        int[] arr1 = {1, 2, 3,4, 5,6,7,8,9,10, 10, 11, 12,13, 20};
        int[] arr = {2, 3, 5,6,7,8,10,11,12,13,15,20,23,30};
        int key = 9;
        System.out.println(binSearchInInfiniteArray(arr, key));
    }

    static int binSearchInInfiniteArray(int[] arr, int key) {
        //        start with a box of 2, keep doubling the box size if item is not present within the box
        int s=0;
        int e=1;

        while (key>arr[e]) {
            //double the window size
            s=e+1;
            e=2*(e+1) + 1;
        }
        return binSearch(arr, key, s, e);
    }

    static int binSearch(int[] arr, int key, int s, int e) {
        while(s<=e) {
            int m=s+(e-s)/2;
            int diffIn = e-s;
            if (arr[m] == key) {
                return m;
            }else if (key>arr[m]) {
                s=m+1;
            }else {
                e=m-1;
            }
        }
        return -1;
    }
}
