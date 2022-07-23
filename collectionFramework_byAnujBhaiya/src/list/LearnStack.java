package list;

import java.util.Iterator;
import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Cat");
        animals.push("Dog");
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Jaguar");
        System.out.println(animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals);

        animals.push("Leopard");

        Iterator<String> itr = animals.iterator();;
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
