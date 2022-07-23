package com.shubham.temp;

import java.util.Scanner;

public class MyClass2 {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        PrimeManagement prm[] = new PrimeManagement[4];
        for (int i=0; i<4; i++) {
            int primeId = con.nextInt();
            String userProfileName = con.next();
            String subscriptionType = con.next();
            double subscriptionPrice = con.nextDouble();
            int noOfProfiles = con.nextInt();

            prm[i] = new PrimeManagement(primeId, userProfileName, subscriptionType, subscriptionPrice, noOfProfiles);
        }


        String test = con.next();
        con.close();

        int res = findAvgPriceByType(prm, test);
        if (res == -1) {
            System.out.println("There is no such prime management");
        }else {
            System.out.println(res);
        }
    }


    static int findAvgPriceByType(PrimeManagement pmo[], String subscriptionType) {
        int ans=0;
        int count=0;
        for (int i=0; i<4; i++) {
            if (pmo[i].getSubscriptionType().equalsIgnoreCase(subscriptionType)) {
                if (pmo[i].getNoOfProfiles() > 3) {
                    ans+=pmo[i].getSubscriptionPrice();
                    count++;
                }
            }
        }

        if (count == 0 ) {
            return -1;
        }
        return (ans/count);
    }
}



class PrimeManagement {
    private int primeId;
    private String userProfileName;
    private String subscriptionType;
    private double subscriptionPrice;
    private int noOfProfiles;

    //    getters & setters
    public int getPrimeId() {
        return primeId;
    }

    public void setPrimeId(int primeId) {
        this.primeId = primeId;
    }

    public String getUserProfileName() {
        return userProfileName;
    }

    public void setUserProfileName(String userProfileName) {
        this.userProfileName = userProfileName;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public double getSubscriptionPrice() {
        return subscriptionPrice;
    }

    public void setSubscriptionPrice(double subscriptionPrice) {
        this.subscriptionPrice = subscriptionPrice;
    }

    public int getNoOfProfiles() {
        return noOfProfiles;
    }

    public void setNoOfProfiles(int noOfProfiles) {
        this.noOfProfiles = noOfProfiles;
    }


    //    constructor
    public PrimeManagement(int primeId, String userProfileName, String subscriptionType, double subscriptionPrice, int noOfProfiles) {
        this.primeId = primeId;
        this.userProfileName = userProfileName;
        this.subscriptionType = subscriptionType;
        this.subscriptionPrice = subscriptionPrice;
        this.noOfProfiles = noOfProfiles;
    }
}
