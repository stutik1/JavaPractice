package Collections;

import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("Megha");
        list.addFirst("Guru");
        System.out.println(list);

        list.addLast("Stuti"); // also use only add instead of addLast
        System.out.println(list);
        list.addFirst("My name is");
        System.out.println(list);
        System.out.println(list.size());

        for (int i=0;i< list.size();i++){
            System.out.print(list.get(i) + "->");
        }
        System.out.println("NULL");

        list.remove(2); // for particular element we want to remove
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

    }
}
