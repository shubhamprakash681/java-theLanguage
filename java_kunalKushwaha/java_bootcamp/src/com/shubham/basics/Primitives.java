package com.shubham.basics;

public class Primitives {
//    datatypes that cannot be breaked further
//    int, char, float, double, long, boolean
    public static void main(String[] args) {
        int rollNo = 65;
        char letter = 'h';
        float marks = 78.90f;
        double largeDecimals = 63453453.43354;
        long largeIntegers = 56346343L;
        boolean b = false;

//        wrapper classes of primitive datatype
//        classes are used to add additional functionalities
//        A Wrapper class can be used with a collection such as ArrayList, etc.
//        A primitive type is not used with collections.
        Integer intObj = new Integer(76);
        System.out.println(intObj.doubleValue());
        System.out.println(intObj.hashCode());
        Double dbObj = new Double(325234.65D);
        System.out.println(dbObj.hashCode());
    }
}
