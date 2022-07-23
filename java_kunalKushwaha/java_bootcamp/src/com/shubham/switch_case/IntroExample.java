package com.shubham.switch_case;

import java.util.Scanner;

public class IntroExample {
    public static void main(String[] args) {
//        "==" returns true if & only if both identifier points to the same object
//        but, String.equals() returns true if their values are equal...they may be different objects

        Scanner con = new Scanner(System.in);
        String fruit;
        System.out.println("Enter a fruit name: ");
        fruit = con.next();
        switch (fruit) {
            case "mango", "Mango", "MANGO" -> System.out.println("King of fruits");
            case "apple", "Apple", "APPLE" -> System.out.println("Sweet Red fruit");
            case "orange", "Orange", "ORANGE" -> System.out.println("Brown fruit");
            case "grapes", "Grapes", "GRAPES" -> System.out.println("Small fruit");
            default -> System.out.println("Please enter a valid fruit ");
        }
    }
}
