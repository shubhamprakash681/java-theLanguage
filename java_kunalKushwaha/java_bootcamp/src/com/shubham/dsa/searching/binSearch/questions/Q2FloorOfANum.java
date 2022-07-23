package com.shubham.dsa.searching.binSearch.questions;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2FloorOfANum {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (!(con.hasNext("E"))) {
            list.add(con.nextInt());
        }
        con.next();
        int key = con.nextInt();
        System.out.println(ceilOfANumBS(list, key));
    }

    static int ceilOfANumBS(ArrayList<Integer> list, int key) {
        int st = 0;
        int en = list.size()-1;
        int ansiN=0;
        if (key < list.get(0)) {
            return -1;
        }
        while (st<=en) {
            int mid = st + (en-st)/2;
            if (key == list.get(mid)) {
                return list.get(key);
            } else if (key > list.get(mid)) {
                st = mid + 1;
            } else {
                en = mid - 1;
            }
            ansiN = en;
        }
        return list.get(ansiN);
    }
}
