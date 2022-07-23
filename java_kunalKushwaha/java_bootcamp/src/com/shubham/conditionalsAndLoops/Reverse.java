package com.shubham.conditionalsAndLoops;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        String num=con.next();
        int l = num.length();
        for (int i=l-1; i>=0; i--) {
            System.out.print(num.charAt(i));
        }
    }
}
