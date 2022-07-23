package com.shubham.temp.sir;

import java.util.HashSet;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        HashSet<Employee> employeeSet = new HashSet<>();

        while (true) {
            try {
                String line = con.nextLine();
                if (line.isEmpty()) {
                    break;
                }
                String[] lineStr = line.split(",");

                int currId = Integer.parseInt(lineStr[0]);
                String currName = lineStr[1];
                Boolean currIsMale = Boolean.parseBoolean(lineStr[2]);

                Employee currEmployee = new Employee(currId, currName, currIsMale);
                employeeSet.add(currEmployee);

            } catch (Exception e) {
                System.out.println(e.getClass().getName());
                System.exit(0);
            }
        }

        for( Employee currEmployee : employeeSet ){
            System.out.println(currEmployee.getId() + " " + currEmployee.getName() + " " + currEmployee.getMale());
        }
    }

}


class Employee {
    private int id;
    private String name;
    private Boolean isMale;

    public Employee(int id, String name, Boolean isMale) {
        this.id = id;
        this.name = name;
        this.isMale = isMale;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getMale() {
        return isMale;
    }

    public void setMale(Boolean male) {
        isMale = male;
    }
}
