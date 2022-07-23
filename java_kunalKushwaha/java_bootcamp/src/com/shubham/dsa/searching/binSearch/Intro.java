package com.shubham.dsa.searching.binSearch;

import java.util.ArrayList;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        ArrayList<Integer> ls = new ArrayList<>();
        System.out.println("Enter array Elements: ");
        while (!(con.hasNext("E"))) {
            ls.add(con.nextInt());
        }
        System.out.print("Enter key: ");
        con.next();
        int key = con.nextInt();
        System.out.println(binSearch(ls, key));
    }

    static int binSearch(ArrayList<Integer> ls, int key) {
        int start = 0;
        int end = ls.size() - 1;
        while (start <= end) {
//            int mid = (start+end)/2;    //note:- start+end may sometime exceed the range of Integer -->error
            int mid = start + (end - start)/2;  //better way
            if (key == ls.get(mid)) {
                return mid;
            }else if (key > ls.get(mid)) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
