package com.shubham.temp;

import java.util.*;

public class Fa2 {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        HashMap<Integer, Integer> numRep = new HashMap<Integer, Integer>();
        String l1 = con.next();
        String[] l1Vec;
        l1Vec = l1.split(",");
//        System.out.println(l1);

        for (int i = 0; i < l1Vec.length; i++) {
            int temp = Integer.parseInt(l1Vec[i]);
            arr1.add(temp);
            numRep.put(temp, 1);
        }
        String l2 = con.next();
        String[] l2Vec;
        l2Vec = l2.split(",");
//        System.out.println(l1);

        for (int i = 0; i < l2Vec.length; i++) {
            int temp = Integer.parseInt(l2Vec[i]);
            arr2.add(temp);
            numRep.put(temp, numRep.getOrDefault(temp, 0) + 1);
        }

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(numRep);

        List<Integer> sortedNumRep = new ArrayList<>(numRep.keySet());
        Collections.sort(sortedNumRep);
        Collections.sort(arr1);
        Collections.sort(arr2);
        System.out.println(sortedNumRep);

        int m = 0;
        for (int i = 0; i < sortedNumRep.size(); i++) {
            if (numRep.get(sortedNumRep.get(i)) == 2) {
                m = sortedNumRep.get(i);
            }
        }
        System.out.println(m);
        int t = m;
        m = 0;
        while (t > 0) {
            m += t % 10;
            t /= 10;
        }
        System.out.println(m);

        System.out.println(arr1);
        System.out.println(arr2);

        int[][] outMat = new int[2][m];
        for (int i=0; i<m; i++) {
//            outMat[i]=
        }

    }

}
