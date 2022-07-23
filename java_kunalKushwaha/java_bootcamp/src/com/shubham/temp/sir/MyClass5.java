package com.shubham.temp.sir;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class MyClass5 {

    static int generateSmallest(int input1) {
        ArrayList<Integer> ls = new ArrayList<>();
        while (input1 > 0) {
            ls.add(input1 % 10);
            input1 /= 10;
        }

        Collections.sort(ls);


        return (ls.get(0)*10) + (ls.get(1));
    }


    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int input1 = con.nextInt();

        int result = generateSmallest(input1);
        System.out.println(result);
    }


}
