package com.shubham.dsa.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("!! Terminate i/p by 'Exit'");
        System.out.print("Enter a list of integers: ");
        while(!con.hasNext("Exit")) {
            list.add(con.nextInt());
        }
        int st=0, en=list.size()-1;
        while (st<=en) {
            mySwap(list, st, en);
            st++;
            en--;
        }
        System.out.println("Reversed array: " + list);
    }

    static void mySwap(ArrayList<Integer> list, int i1, int i2) {
        int temp = list.get(i1);
        list.set(i1, list.get(i2));
        list.set(i2, temp);
    }
}
