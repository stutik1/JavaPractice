package javaFundamental;

import java.util.Arrays;

public class ArrayFunction {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 100;
        marks[1]= 90;
        marks[2] =95;

        /// length
        System.out.println(marks.length);

        // sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
    }
}
