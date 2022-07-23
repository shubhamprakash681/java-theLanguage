package com.shubham.temp.sir;

import java.util.*;

class Pair {
    int x;
    int y;

    // Constructor
    public Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

public class lonePrime {

    static Boolean isPrime(int n) {
        for (int i=2; i<=n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int fun(ArrayList<Integer> nums) {
        ArrayList<Integer> unq = new ArrayList<>();
        ArrayList<Pair> repCount = new ArrayList<>();
        Collections.sort(nums);
        for (int i=1; i<nums.size()-1; i++) {
            if (nums.get(i) != nums.get(i-1) && nums.get(i) != nums.get(i+1)) {
                unq.add(nums.get(i));
            }
        }

        for (int i=0; i< unq.size(); i++) {
            if (isPrime(unq.get(i)) == true) {
                return (unq.get(i));

            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        String line = con.nextLine();
        String[] lineStr = line.split(",");
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i=0; i< lineStr.length; i++) {
            String temp = lineStr[i];
            nums.add(Integer.parseInt(temp));
        }
//        System.out.println(nums);
        System.out.println(fun(nums));

    }

}
