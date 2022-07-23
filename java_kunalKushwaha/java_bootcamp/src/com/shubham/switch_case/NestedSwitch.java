package com.shubham.switch_case;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        System.out.println("Enter Employee Id: ");
        int employId = con.nextInt();
        System.out.println("Enter Department: ");
        String department = con.next();
        switch (employId) {
            case 1 -> {
                System.out.println("Shubham Prakash");
                switch (department) {
                    case "IT":
                        System.out.println("From IT-department");
                        break;
                    case "management":
                    case "Management":
                    case "MANAGEMENT":
                        System.out.println("From Management department");
                        break;
                    default:
                        if (department.isBlank()) {
                            System.out.println("No Department Entered");
                        }else {
                            System.out.println("Wrong Department entered");
                        }
                }
            }
            case 2 -> {
                System.out.println("Shivam Prakash");
                switch (department) {
                    case "IT":
                        System.out.println("From IT-department");
                        break;
                    case "management":
                    case "Management":
                    case "MANAGEMENT":
                        System.out.println("From Management department");
                        break;
                    default:
                        if (department.isBlank()) {
                            System.out.println("No Department Entered");
                        }else {
                            System.out.println("Wrong Department entered");
                        }
                }
            }
            case 3 -> {
                System.out.println("Kunal Kushwaha");
                switch (department) {
                    case "IT":
                        System.out.println("From IT-department");
                        break;
                    case "management":
                    case "Management":
                    case "MANAGEMENT":
                        System.out.println("From Management department");
                        break;
                    default:
                        if (department.isBlank()) {
                            System.out.println("No Department Entered");
                        }else {
                            System.out.println("Wrong Department entered");
                        }
                }
            }
            default -> System.out.println("Enter correct Employee ID");
        }
    }
}
