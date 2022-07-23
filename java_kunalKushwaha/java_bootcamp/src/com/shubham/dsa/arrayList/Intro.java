package com.shubham.dsa.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        Scanner con = new Scanner( System.in);
//        Arraylist<WrapperClass> varName = new ConstructorClass<>(initialSize)
        ArrayList<Integer> list = new ArrayList<>();
//        inputs
        for (int i=0; i<5; i++) {
            list.add(con.nextInt());
        }
//        output
        System.out.println(list);
        list.set(0, 99);
        list.remove(1);

        System.out.println(list);
//        another way to print
        for (int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
