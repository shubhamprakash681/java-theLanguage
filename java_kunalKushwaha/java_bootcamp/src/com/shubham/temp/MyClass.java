package com.shubham.temp;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        String str = con.next();
        int count=0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)>='A' && str.charAt(i)<='Z') {
                count++;
            }
        }
        if (count!=0) {
            System.out.println(count);
        }else{
            System.out.println("NA");
        }
    }
}
