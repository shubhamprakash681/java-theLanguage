package com.shubham.temp.sir;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        String str = con.next();
        if (isVowel(str.charAt(1))){
            System.out.println("TRUE");
        }else {
            System.out.println("FALSE");
        }
    }

    static boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }
}
