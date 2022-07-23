package com.shubham.dsa.searching.binSearch;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderAgnosticBinSearch {
    public static void main(String[] args) {
//        when we not know whether the given data is ascending or descending, we go for order agnostic bin search
        Scanner con = new Scanner(System.in);
        ArrayList<Integer> ls = new ArrayList<>();
        System.out.println("Enter array Elements: ");
        while (!(con.hasNext("E"))) {
            ls.add(con.nextInt());
        }
        System.out.print("Enter Key: ");
        con.next();
        int key = con.nextInt();
        boolean isAscending = (ls.get(ls.size()-1) >= ls.get(0));
        System.out.println(orderAgnosticBinSearch(ls, key, isAscending));
    }

    static int orderAgnosticBinSearch(ArrayList<Integer> list, int key, boolean asc) {
        int start = 0;
        int end = list.size()-1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (key == list.get(mid)) {
                return mid;
            }else if (key > list.get(mid)) {
                if (asc) {
                    start = mid + 1;
                }else  {
                    end = mid -1;
                }
            }else {
                if (asc) {
                    end = mid -1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
