package com.shubham.functions.variableLengthArguments;

import java.util.Arrays;

public class VarArgs {
    //    methods that can take variable number of arguments
    public static void main(String[] args) {
        fun(2, 43, 46, 576, 67, 457, 4,76 , 87);
        strFun("Shubham", "Prakash", "Shivam", "Hunny");
        System.out.println(myAdder(12, 24, 3543, 45, 54, 56, 54, 64, 32, 543, 5, 433, 34));
    }

    static void fun(int ...a) {
        System.out.println(Arrays.toString(a));
    }
    static void strFun(String ...str) {
        for (int i=0; i<str.length; i++) {
            System.out.println(str[i]);
        }
    }

    static int myAdder(int a, int b, int ...arr) {
        //note:- while declaring parameters in functions, variable length arguments must be declared at end..
        //b/c if we declare any parameter after a variable length param.,
        // then it would be confusion for the compiler to take the last argument
        int s=0;
        s=a+b;
        for (int i=0; i<arr.length; i++) {
            s+=arr[i];
        }
        return s;
    }
}
