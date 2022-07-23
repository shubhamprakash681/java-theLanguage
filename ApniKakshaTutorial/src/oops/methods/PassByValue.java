package oops.methods;

public class PassByValue {
    public static void main(String[] args) {
        int c=34;
        int d=12;
        swap(c,d);
        System.out.println("c= "+c +", d= "+d);

        Dog d1 = new Dog();
        Dog d2 = new Dog();
        d1.legs = 4;
        d2.legs =3;
        swap(d1,d2);
        System.out.println("Dog 1 legs = "+ d1.legs +", Dog 2 legs = "+ d2.legs);

        Dog d3 = new Dog();
        d3.legs = 4;
        changeDog(d3);
        System.out.println(d3.legs);
    }

    static void  swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    static void swap(Dog a, Dog b) {
        Dog temp = a;
        a = b;
        b = temp;
    }
    static void changeDog(Dog d) {
        d.legs = 6;
    }
}

class Dog {
    int legs;
}