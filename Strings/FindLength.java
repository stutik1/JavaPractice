package Strings;

import java.util.Scanner;

public class FindLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Input your name" + name);
        System.out.println(name.length());

        // charAt method
        for (int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    }
}
