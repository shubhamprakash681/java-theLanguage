package com.shubham.dsa.arrays;

public class Intro {
    public static void main(String[] args) {
//        datatype[] variable_name = new datatype[size]
//        store 5 oll no.s
        int[] rollNo = new int[5];  //[0, 0, 0, 0, 0]
        int[] rollNo2 = {1, 2, 3, 4, 6};

        int[] ros;//declaration--> ros is getting defined in stack (at compile time)
        ros = new int[3];  //initialisation--> object is being created in the heap memory
        // (at run-time ---> ie, dynamic memory allocation)

//        in C/C++, array objects are allocated to continuous blocks of memory
//        in JAVA, array objects may be allocated to discontinuous blocks of memory -->depends on jVM

//        indices
        for (int i=0; i<rollNo.length; i++) {
            System.out.print(rollNo[i] + " ");
        }

        String[] str = new String[5];   //[null, null, null, null, null]
        for (int i=0; i< str.length; i++) {
            System.out.print(str[i] + " ");
        }
//        null is assigned to non-primitive(or, objects) data-types if they are declared but, not initialised
    }
}
