package com.shubham.temp.sir;

import java.util.Scanner;

public class c1 {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int houseNo[] = new int[10];
        double houseSize[] = new double[10];
        double housePrice[] = new double[10];

        System.out.println("Enter house number, size, and price for 10 houses:");
        for (int i=0; i<10; i++) {
            houseNo[i] = con.nextInt();
            houseSize[i] = con.nextDouble();
            housePrice[i] = con.nextDouble();
        }

        System.out.println("Enter the price range: ");

        double startPrice = con.nextDouble();
        double endPrice = con.nextDouble();

        System.out.println("House information for this range:");
        System.out.println(" House No.    Size       Price");
        int count = 0;
        for (int i=0; i<10; i++) {
            if (housePrice[i] > startPrice && housePrice[i] < endPrice) {
                System.out.println("    " + houseNo[i] + "        " + houseSize[i] + "     " + housePrice[i]);
                count++;
            }
        }

        System.out.println("The number of houses found was: " + count);

    }
}
