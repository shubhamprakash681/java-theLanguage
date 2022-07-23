package com.shubham.dsa.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxBtw2Indices {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        ArrayList<Integer> ls = new ArrayList<>();
        System.out.println("!! Terminate the input line with 'Exit'");
        System.out.print("Enter a list of numbers: ");
        while(!con.hasNext("Exit")) {
            ls.add(con.nextInt());
        }
        System.out.println(ls);
        con.next();
        int startingIndex, endIndex;
        System.out.print("Enter starting index: ");
        startingIndex = con.nextInt();
        System.out.print("Enter ending index: ");
        endIndex = con.nextInt();
        int max = ls.get(startingIndex);
        for (int i=startingIndex; i<=endIndex; i++) {
            max = Math.max(max, ls.get(i));
        }
        System.out.println("Max. element in the specified range is: " + max);
        con.close();
    }
}
