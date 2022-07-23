package oops.methods;
public class Introduction {
    public static void main(String[] args) {
        int firstNumber = 34;
        int secondNumber = 23;
        int result = maxNumber(firstNumber, secondNumber);
        System.out.println(result);
        sayHi();
    }
    static int maxNumber(int a, int b) {
        if (a>b) {
            return a;
        }
        else {
            return b;
        }
    }
    static void sayHi() {
        System.out.println("Hi!!");
        System.out.println("Good Morning!!!");
    }
}
