package javaFundamental;

public class MathsClass {
    public static void main(String[] args) {
        System.out.println(Math.max(5,6));
        System.out.println(Math.min(5,6));

        // random number greater than or equal to 0.0 and less than 1.0.
        System.out.println(Math.random());
         System.out.println((int)Math.random());   // always return 0 bcz smallest range of int value is 0
        System.out.println((int)(Math.random()*100));   // use explict value for more than 1 number
    }
}
