package com.shubham.functions.functionOverloading;

public class FunOver {
//    two or more functions with the same name can exist if their parameters are different
    public static void main(String[] args) {
        myFun(65);  //func. at line 10 is being called
        myFun("Shubham Prakash");   //func. at line 14 is being called
//        decision is taken place while compilation

        System.out.println(mySum(43, 54));  //func. at line 21 is being called
        System.out.println(mySum(1, 3, 43));    //func. at line 26 is being called
    }

    static void myFun(int a) {
        System.out.println(a);
    }

    static void myFun(String str) {
        System.out.println(str);
    }

    static int mySum(int a, int b) {
        return a+b;
    }

    static int mySum(int a, int b, int c) {
        return a+b+c;
    }
}
