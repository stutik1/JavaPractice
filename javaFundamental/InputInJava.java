package javaFundamental;

import java.util.*;

public class InputInJava {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input ur age :");

        int age = sc.nextInt();
        float age1 = sc.nextFloat();
        System.out.println(age);
        System.out.println(age1);

        //// String /////

        //Scanner scan = new Scanner(System.in);
        System.out.println("Input ur Name : ");
        String name = sc.next(); // it use token means a single word
        //String name = scan.nextLine();
        System.out.println(name);

    }
}
