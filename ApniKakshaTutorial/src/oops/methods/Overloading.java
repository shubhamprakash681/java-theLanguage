package oops.methods;
//class having2 or more same method but with differerent partameters
public class Overloading {
    public static void main(String[] args) {
        int firstNumber = 34;
        int secondNumber = 23;
        int result = maxNumber(firstNumber, secondNumber);
        System.out.println(result);
        sayHi();
        System.out.println(maxNumber(3,5,7));
    }
    static int maxNumber(int a, int b) {
        if (a>b) {
            return a;
        }
        else {
            return b;
        }
    }
    static int maxNumber(int c, int d, int e) {
        if (c>d && c>e) {
            return  c;
        }
        else  if (d>c && d>e) {
            return  d;
        }
        else {
            return e;
        }
    }
    static void sayHi() {
        System.out.println("Hi!!");
        System.out.println("Good Morning!!!");
    }
}
