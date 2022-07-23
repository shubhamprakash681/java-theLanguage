package list;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {
//  increases its size by n-> (n+n/2 + 1) when arraylist is full
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        System.out.println(students);
        students.add("Shubham");

        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(0, 0);
        ls.add(998);
        ls.add(8676);
        System.out.println(ls);
        ls.add(1, 76);
        System.out.println(ls);

        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(98);
        newList.add(12);

        ls.addAll(2,  newList);
        System.out.println(ls);

        for(int i=0; i<ls.size(); i++) {
            System.out.print(ls.get(i) + " ");
        }
        System.out.println();

        ls.set(1, 43434);
        System.out.println(ls);
        System.out.println(ls.contains(43434));

        ls.remove(1);
        ls.remove(Integer.valueOf(8676));
        System.out.println(ls);

        newList.addAll(ls);
        ls.clear();
        System.out.println(ls);



//        traversal
//        simple for loop
        for (int i=0; i<newList.size(); i++) {
            System.out.println("element at " + i + "th index is " + newList.get(i));
        }

//        foreach loop
        for (Integer element:newList) {
            System.out.print(element + " ");
        }
        System.out.println();

//        iterator
        Iterator<Integer> itr = newList.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();


        ArrayList<String> names = new ArrayList<>();
        names.add("Shubham");
        names.add("Prakash");
        names.add("Shivam");
        names.add("Prakash");
        names.add("Rahul Verma");
        names.add("Hrithik Roshan");
        names.add("Shah Rukh Khan");
        Iterator<String> it = names.iterator();
        System.out.println(it.hasNext());
        if (it.next().equals("Shubham")) {
            it.remove();
        }
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.println(names);
    }
}
