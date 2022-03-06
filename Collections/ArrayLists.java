package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>();

        // add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // get elements
        int element = list.get(1);
        System.out.println(element);

        // Add elements in between
        list.add(1,5);
        System.out.println(list);

        // set element
        list.set(1,8);
        System.out.println(list);

        // delete element
        list.remove(4);
        System.out.println(list);

        // size of an array
       int size = list.size();
        System.out.println("Size of an ArrayList : " + size);

        // loop in an arraylist
        for (int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }

        // Sorting
        Collections.sort(list);
        System.out.println(list);

    }
}
