package Collection.List;

/*
* List Interface in java is a part of the java.util and sub interface of
* the Collection interface.
*
* Store an ordered collection of element (Known as sequence)
*
* Can contain duplicate elements
*
* List is interface is implemented by several classes in the Java
* collection framework such as
* ArrayList,
* LinkedList,
* Vector,
* Stack
*
* Key features:
* Order preservation
* Index-Based Access
* Allow duplicates
*
* ArrayList
*
* Arraylist can change its size dynamically unlike array.
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();

        // add element
        list.add(10); // 0
        list.add(20); // 1
        list.add(30); // 2

        // to access element
        System.out.println(list.get(0));

        // to find size
        System.out.println(list.size());

        // iterate the list
        for (int i : list){
            System.out.println(i);
        }

        // contain
        System.out.println(list.contains(10));
        System.out.println(list.contains(50));

        list.remove(1);
        for (int i : list){
            System.out.println(i);
        }

        list.add(1,20);
        System.out.println(list);

        List<String> list1 = Arrays.asList("Monday","Tuesday");
        System.out.println(list1);

        List<Integer> integers = List.of(1, 2, 3, 4);
        System.out.println(integers);

    }
}
