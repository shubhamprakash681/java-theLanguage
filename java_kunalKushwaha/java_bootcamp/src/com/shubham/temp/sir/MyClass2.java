package com.shubham.temp.sir;

import java.io.BufferedReader;
import  java.lang.*;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MyClass2 {
    public static void main(String[] args) throws java.lang.Exception {
//        Scanner con = new Scanner(System.in);
        BufferedReader con = new BufferedReader(new InputStreamReader(System.in));
        Watch watches[] = new Watch[4];
        for (int i=0; i<4; i++) {
            int watchId = Integer.parseInt(con.readLine());
            String watchName = con.readLine();
            double price = Double.parseDouble(con.readLine());
            String brand = con.readLine();

            watches[i] = new Watch(watchId, watchName, price, brand);
        }

//        for (int i=0; i<watches.length; i++) {
//            System.out.println(watches[i].getWatchName());
//        }

        String testBrand = con.readLine();
        con.close();

        int res = countWatchesByBrand(watches, testBrand);

        if (res!=0) {
            System.out.println(res);
        }else {
            System.out.println("No such Watch");
        }

    }

    static int countWatchesByBrand(Watch watches[], String brand) {
        int ans=0;
        for (int i=0; i<watches.length; i++) {
            if (watches[i].getBrand().equals(brand) && isVowel(watches[i].getBrand().charAt(0))) {
                ans++;
            }
        }
        return ans;
    }

    static boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }
}


class Watch {
    private int watchId;
    private String watchName;
    private double price;
    private String brand;

//    getters and setters
    public int getWatchId() {
        return watchId;
    }

    public void setWatchId(int watchId) {
        this.watchId = watchId;
    }

    public String getWatchName() {
        return watchName;
    }

    public void setWatchName(String watchName) {
        this.watchName = watchName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    //    constructor
    public Watch(int watchId, String watchName, double price, String brand) {
        this.watchId = watchId;
        this.watchName = watchName;
        this.price = price;
        this.brand = brand;
    }
}