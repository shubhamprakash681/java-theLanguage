package com.shubham.dsa.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDim {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i=0; i<3; i++) {
            list.add(new ArrayList<>());
        }
        System.out.println(list);
        for (int i=0; i<list.size(); i++) {
            for (int j=0; j<3; j++) {
                list.get(i).add(con.nextInt());
            }
        }
        System.out.println(list);
    }
}
