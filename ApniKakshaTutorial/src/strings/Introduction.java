package strings;

import java.util.Locale;

/**
 * note:-
 * Strings are immutable
 * means they  cannot be changed
 * if we change their values, it will not delete it's previous value from memory
 * only it will reassign the new value of the variable and will store it in different memory location..
 */
public class Introduction {
    public static void main(String[] args) {
        String name = "Shubham"; // first it will search in heap memory
        String anotherName = new String("Prakash");  //only stores in new memory
        String name2 = "Shubham";
        String name3 = new String("Prakash");
        System.out.println(name);
        System.out.println(anotherName);
        System.out.println(name == name2);
        System.out.println(name3 == name2);

        // char at:-
        // Syntax:  charAt(int index)
        System.out.println(name.charAt(6));

        // int length()
        System.out.println(name.length());

        //substring:-
        //Syntax:  String substring(int beginIndex)
        System.out.println(name.substring(2));
        //Syntax: String substring(int beginIndex, int endIndex)
        System.out.println(name.substring(2,6));

        //contains
        //Syntax:  boolean contains(charSequence s)
        System.out.println(name.contains("ubh"));

        //equals
        System.out.println("Using stingName.equals:");
        System.out.println(name.equals(name2));

        //isEmpty
        System.out.println(name.isEmpty());

        //String concat
        //used to append something to a string
        System.out.println(name.concat(" is the boss"));
        String pyt = name + name2;
        System.out.println("i am here "+pyt);
        System.out.println(name);

        //alt. method to append:
        // called overloading a string
        name = name + " is the boss";
        System.out.println(name);

        //replace
        System.out.println(name.replace('i','I'));

        //split
        // String[] split(String regex)
        //used for separating a single string
        String cars = "Huindai, Swift, Maruti, Ferrari, Wagnor, Lamborghini";
        String allCars[] = cars.split(",");
        for (String car: allCars) {
            System.out.print(car );
        }
        System.out.println();
        for (int i=0; i< allCars.length; i++) {
            System.out.print(allCars[i]);
        }
        System.out.println();

        //indexOf(int ch)
        //returns -1 if character is not present in the string
        System.out.println(name.indexOf('s'));

        //String toLowerCase()
        System.out.println(name.toLowerCase(Locale.ROOT));

        //toUpperCase()
        System.out.println(name.toUpperCase(Locale.ROOT));

        //String trim()
        String str = "      gfyf       ";
        System.out.println(str.trim());

        //reverse
        System.out.println(name.length());
        String revStr = "";
        for (int i=name.length()-1; i>=0; i--) {
            revStr += name.charAt(i);
        }
        System.out.println(revStr);
    }
}
