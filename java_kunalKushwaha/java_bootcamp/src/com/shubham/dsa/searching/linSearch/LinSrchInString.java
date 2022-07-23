package com.shubham.dsa.searching.linSearch;

import java.util.Scanner;

public class LinSrchInString {
    public static void main(String[] args) {
        Scanner con = new Scanner((System.in));
        System.out.print("Enter a string: ");
        String str = con.nextLine();
        System.out.print("Enter character key: ");
        char key = con.next().trim().charAt(0);
        int res = myLinSearch(str, key);
        System.out.println(res);
    }

    static int myLinSearch(String str, char key) {
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == key) {
                return i;
            }
        }
        return -1;
    }
}
