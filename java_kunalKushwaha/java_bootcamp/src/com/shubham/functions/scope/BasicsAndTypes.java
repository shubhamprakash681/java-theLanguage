package com.shubham.functions.scope;

public class BasicsAndTypes {
    public static void main(String[] args) {
        //        function scope
        myFunction();

        //       block scope
        int a=-67;
        int b=76;
        {
            int c = a+b;
            System.out.println(c);
        }
//        System.out.println(c);  //error

//        loop scope
        for (int i=0; i<6; i++) {
            System.out.print(i +" ");
        }
//        System.out.print(i + " ");  //error
    }

    static void myFunction() {
        int a =10, b=90;
//        scope of a & b is only inside this function
    }
}
