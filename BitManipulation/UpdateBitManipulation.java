package BitManipulation;

import java.util.Scanner;

public class UpdateBitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        int n= 5;
        int pos=2;

       // int operation = 1; //update bit to 1 else update bit to 0
        int bitMask = 1<<pos;
        if (operation == 1){
            // set operation
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else{
            // clear operation
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }


    }
}
