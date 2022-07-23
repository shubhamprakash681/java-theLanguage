package com.shubham.temp.sir;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MyClass4 {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader con = new BufferedReader(new InputStreamReader(System.in));
        Beach beaches[] = new Beach[4];
        for (int i=0; i<4; i++) {
            int beachId = Integer.parseInt(con.readLine());
            String beachName = con.readLine();
            String location = con.readLine();
            String beachType = con.readLine();
            int rating = Integer.parseInt(con.readLine());
            int avgVisitorsPerDay = Integer.parseInt(con.readLine());

            beaches[i] = new Beach(beachId, beachName, location, beachType, rating, avgVisitorsPerDay);
        }

        String givenLocation = con.readLine();
        int givenAvgVisitorsPerDay = Integer.parseInt(con.readLine());

        int res = findBeachWithLowestRating(beaches, givenLocation, givenAvgVisitorsPerDay);
        if (res == 0) {
            System.out.println("No such beach");
        }else {
            System.out.println(res);
        }
    }

    static int findBeachWithLowestRating(Beach beaches[], String givenLocation, int givenAvgVisitorsPerDay) {
        int ans = Integer.MAX_VALUE;
        for (int i=0; i<4; i++) {
            if ((beaches[i].getLocation().equals(givenLocation))  &&  (beaches[i].getAverageVisitorsPerDay() > givenAvgVisitorsPerDay)) {
                int currentRating = beaches[i].getRating();
                ans = Integer.min(currentRating, ans);
            }
        }
        if (ans == Integer.MAX_VALUE) {
            ans = 0;
        }
        return ans;
    }
}


class Beach {
    private int beachId;
    private String beachName;
    private String location;
    private  String beachType;
    private int rating;
    private int averageVisitorsPerDay;

    //    constructor
    public Beach(int beachId, String beachName, String location, String beachType, int rating, int averageVisitorsPerDay) {
        this.beachId = beachId;
        this.beachName = beachName;
        this.location = location;
        this.beachType = beachType;
        this.rating = rating;
        this.averageVisitorsPerDay = averageVisitorsPerDay;
    }


    //    getters and setters
    public int getBeachId() {
        return beachId;
    }

    public void setBeachId(int beachId) {
        this.beachId = beachId;
    }

    public String getBeachName() {
        return beachName;
    }

    public void setBeachName(String beachName) {
        this.beachName = beachName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBeachType() {
        return beachType;
    }

    public void setBeachType(String beachType) {
        this.beachType = beachType;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getAverageVisitorsPerDay() {
        return averageVisitorsPerDay;
    }

    public void setAverageVisitorsPerDay(int averageVisitorsPerDay) {
        this.averageVisitorsPerDay = averageVisitorsPerDay;
    }
}