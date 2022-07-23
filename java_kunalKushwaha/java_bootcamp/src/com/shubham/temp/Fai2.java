package com.shubham.temp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Fai2 {
    public static void main(String[] args) {
        Scanner con=new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        String line;
        String[] lineVector;
        int[] rep = new int[100];
        HashMap<Integer, Integer> numRep = new HashMap<Integer, Integer>();

        line = con.nextLine();
        lineVector = line.split(",");
//        System.out.println(lineVector);
        for (int i=0; i< lineVector.length-1; i++) {
            int num= Integer.parseInt(lineVector[i]);
            arr1.add(num);
            rep[num]++;
            numRep.put(num, 1);
        }
        con.next();
        line = con.nextLine();
        lineVector = line.split(",");
//        System.out.println(lineVector);
        for (int i=0; i< lineVector.length-1; i++) {
            int num= Integer.parseInt(lineVector[i]);
            arr2.add(num);
            rep[num]++;
            numRep.put(num, numRep.get(num)+1);
        }
        System.out.println(numRep);

        for (int i=0; i<arr1.size(); i++) {
            System.out.print(arr1.get(i) + " ");
        }
        System.out.println();
        for (int i=0; i<arr2.size(); i++) {
            System.out.print(arr2.get(i) + " ");
        }
        System.out.println();

        for (int i=0; i<rep.length; i++) {
            System.out.print(rep[i] + " ");
        }

    }
}
