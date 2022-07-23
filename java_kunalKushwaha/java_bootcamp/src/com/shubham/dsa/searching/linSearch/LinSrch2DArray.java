package com.shubham.dsa.searching.linSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LinSrch2DArray {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        System.out.print("Enter no. of rows: ");
        int r = con.nextInt();
        for (int i=0; i<r; i++) {
            ls.add(new ArrayList<Integer>());
        }
        System.out.print("Enter no. of columns: ");
        int c = con.nextInt();
        System.out.println("Enter elements: ");
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                ls.get(i).add(con.nextInt());
            }
        }
        System.out.println(ls);
        System.out.print("Enter key: ");
        int key = con.nextInt();
        int[] res = linSearchFor2DArray(ls, key);
        System.out.println(Arrays.toString(res));
        System.out.println("r= " + (res[0]+1) + " c= " + (res[1]+1));
    }

    static int[] linSearchFor2DArray(ArrayList<ArrayList<Integer>> ls, int k) {
        int r = ls.size();
        int c = ls.get(0).size();

        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                if(ls.get(i).get(j) == k) {
                    int[] ans = {i, j};
                    return ans;
                }
            }
        }
        int[] ans = {-1, -1};
        return ans;
    }
}
