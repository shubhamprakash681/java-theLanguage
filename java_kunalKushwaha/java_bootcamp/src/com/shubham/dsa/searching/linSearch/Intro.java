package com.shubham.dsa.searching.linSearch;

import java.util.ArrayList;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        ArrayList<Integer> ls = new ArrayList<>();
        System.out.print("Enter list of integers: ");
        while (!con.hasNext("Exit")) {
            ls.add(con.nextInt());
        }
        System.out.print("Enter key: ");
        con.next();
        int key = con.nextInt();
        int res = myLinSearch(ls, key);
        if (res == -1) {
            System.out.println(key + " is not there in " + ls);
        }else {
            System.out.println(key + " is found at index: " + res);
        }
    }
    static int myLinSearch(ArrayList<Integer> list, int key) {
        for (int i=0; i< list.size(); i++) {
            if (list.get(i) == key) {
                return i;
            }
        }
        return  -1;
    }
}
