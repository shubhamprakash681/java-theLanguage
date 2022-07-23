package com.shubham.dsa.searching.binSearch.questions;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int n=con.nextInt();
        int[] nums = new int[n];
        for (int i=0; i<n; i++) {
            nums[i] = con.nextInt();
        }
        int target = con.nextInt();
        System.out.println(search(nums, target));
    }


    static int search(int[] nums, int target) {
        int peakInd=findPeakIn(nums);
        System.out.println(peakInd);

        if (target == nums[peakInd]) {
            return peakInd;
        }

        int fTry = orderAgnosticBS(nums, target, 0, peakInd, true);
        if (fTry != -1) {
            return fTry;
        }

        return orderAgnosticBS(nums, target, peakInd, nums.length-1, false);
    }

    static int findPeakIn(int[] nums) {
        if(nums.length == 1) {
            return 0;
        }
        int s=0;
        int e=nums.length-1;
        while (s<=e) {
            int m=s+(e-s)/2;
            if (nums.length > 2) {
                if (nums[m+1] > nums[m]) {
                    s=m+1;
                }else if(nums[m+1] < nums[m]) {
                    e=m;
                } else {
                    return m;
                }
            }else {
                if (nums[1]>nums[0]) {
                    return 1;
                }
                return 0;
            }

        }
        return -1;
    }

    static int orderAgnosticBS(int[] arr, int key, int s, int e, boolean isAsc) {
        while (s<=e) {
            int m=s+(e-s)/2;
            if (arr[m] == key) {
                return m;
            }
            if (isAsc) {
                if (key > arr[m]) {
                    s=m+1;
                }else {
                    e=m-1;
                }
            }else {
                if (key > arr[m]) {
                    e=m-1;
                }else {
                    s=m+1;
                }
            }
        }
        return -1;
    }
}