package com.shubham.temp.sir;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MyClass3 {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader con = new BufferedReader(new InputStreamReader(System.in));
        Fruits fruits[] = new Fruits[4];
        for (int i=0; i<4; i++) {
            int price = Integer.parseInt(con.readLine());;
             String fruitName = con.readLine();
             int fruitId = Integer.parseInt(con.readLine());
             int rating =  Integer.parseInt(con.readLine());

            fruits[i] = new Fruits(fruitId, fruitName, price, rating);
        }

        int testRating = Integer.parseInt(con.readLine());

        int res = findMaximumPriceByRating(fruits, testRating);

        if (res != Integer.MIN_VALUE) {
            System.out.println(res);
        }else {
            System.out.println("No such fruit");
        }
    }

    static int findMaximumPriceByRating(Fruits fruits[], int rating) {
        int ans=Integer.MIN_VALUE;
        for (int i=0; i<fruits.length; i++) {
            if (fruits[i].getRating() > rating) {
                ans = Integer.max(ans, fruits[i].getPrice());
            }
        }
        return ans;
    }
}


class Fruits {
    private int fruitId;
    private String fruitName;
    private  int price;
    private  int rating;

    public Fruits(int fruitId, String fruitName, int price, int rating) {
        this.fruitId = fruitId;
        this.fruitName = fruitName;
        this.price = price;
        this.rating = rating;
    }

    public int getFruitId() {
        return fruitId;
    }

    public void setFruitId(int fruitId) {
        this.fruitId = fruitId;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}