package javaFundamental;

public class Casting {
    public static void main(String[] args) {
        // Casting

        double price = 100.00;
        double price1 = 100;
        double finalPrice =price + 18;
        System.out.println(finalPrice);

        int p =100;
       // int fb = p+18.00; // error bcz int capacity
        int fb1 = p+ (int)18.10; // use explict whhich is int in this (int)18.00 bcz 18.00 is in double
        System.out.println(fb1);
    }
}
