package javaFundamental;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        //////  take an input from user whenever they will not give a negative number . if they put negative nmber then print "THE END".

        Scanner sc = new Scanner(System.in);
        int number ;
        do{
            System.out.println("Input a number");
             number = sc.nextInt();
            System.out.print("here is your number ");
            System.out.println(number);
        }while (number>=0);

        System.out.println("THE END");
    }
}
