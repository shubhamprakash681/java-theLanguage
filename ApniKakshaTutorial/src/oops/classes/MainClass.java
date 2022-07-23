package oops.classes;
class Cat {
    boolean hasFur; //states
    String color, breed; //states
    int legs,eyes; //states

    //behaviors
    //called as methods
    //same as functions..
    public void walk() {
        System.out.println("Cat is walking");
    }
    public void eat() {
        System.out.println("Cat is eating");
    }
    public void description() {
        System.out.println("My cat has "+ legs +" legs and "+ eyes+ " eyes");
    }
}

class Dog {
    String breed, name;

    public void jump() {
        System.out.println("My dog "+ name + " jumped");
    }
    public void description() {
        System.out.println("My dog's name is "+ name +" and it's breed is "+ breed);
    }
}
public class MainClass {
    public static void main(String[] args) {
        //'new' allocates space in memory & gives that address to its object name
        Cat cat1 = new Cat(); //object1 of cat class  it has its own memory
        cat1.walk();
        cat1.legs = 4;
        cat1.eyes = 2;
        cat1.description();

        Cat cat2 = new Cat(); //it has onother (different) memory
        cat2.eat();
        cat2.legs = 3;
        cat2.eyes = 1;
        cat2.description();

        Dog husky = new Dog();
        Dog poodle = new Dog();
        husky.breed = "Husky";
        husky.name = "Browny";
        poodle.breed = "Poodle";
        poodle.name = "Mou";

        husky.jump();
        husky.description();

        poodle.jump();
        poodle.description();
    }
}
