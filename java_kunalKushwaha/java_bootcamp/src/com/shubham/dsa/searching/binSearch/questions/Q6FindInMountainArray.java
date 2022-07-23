package com.shubham.dsa.searching.binSearch.questions;

import java.util.ArrayList;
import java.util.Scanner;

public class Q6FindInMountainArray {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        ArrayList<Integer> mountainArr = new ArrayList<>();

        while (!(con.hasNext("E"))) {
            mountainArr.add(con.nextInt());
        }
        con.next();
        int target = con.nextInt();
        System.out.println(findInMountainArray(target, mountainArr));
    }

    static int findInMountainArray(int target, ArrayList<Integer> mountainArr) {
        int peakIn = findPikIn(mountainArr);
        System.out.println(peakIn);
        System.out.println(mountainArr.get(peakIn));
        int fpr = orderAgnosticBinSearch(mountainArr, target, 0, peakIn, true);
        int spr = orderAgnosticBinSearch(mountainArr, target, peakIn, mountainArr.size()-1, false);
        System.out.println(fpr);
        System.out.println(spr);
        if (fpr!=-1) {
            return fpr;
        }return spr;

    }

    static int findPikIn(ArrayList<Integer> arr) {
        int s=0;
        int e=arr.size()-1;
        while (s<=e) {
            int m = s+(e-s)/2;
            if (arr.get(m)>arr.get(m+1) && arr.get(m)>arr.get(m-1)) {
                return m;
            }else if(arr.get(m+1) > arr.get(m)) {
                s=m;
            }else {
                e=m;
            }

        }
        return -1;
    }

    static int orderAgnosticBinSearch(ArrayList<Integer> list, int key, int start, int end, boolean asc) {
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
