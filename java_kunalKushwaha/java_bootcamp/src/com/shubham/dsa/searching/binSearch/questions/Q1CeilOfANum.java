package com.shubham.dsa.searching.binSearch.questions;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1CeilOfANum {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        ArrayList<Integer> ls = new ArrayList<>();
        while (!(con.hasNext("E"))) {
            ls.add(con.nextInt());
        }
        con.next();
        int key = con.nextInt();
        System.out.println(ceilOfANumBS(ls, key));
    }

    static int ceilOfANumBS(ArrayList<Integer> list, int key) {
        if (key > list.get(list.size()-1)) {
            return -1;
        }
        int start = 0;
        int end = list.size()-1;
        int ansEl=0;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (key == list.get(mid)) {
                return list.get(mid);
            }else if (key > list.get(mid)) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
            ansEl=start;
        }
        return list.get(ansEl);
    }
}
