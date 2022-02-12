package Arrays;

import java.util.Scanner;

public class PrintIndexOfElementX {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int number[] = new int[size];
//
//        // input
//        for (int i=0;i<size;i++){
//           number[i] = sc.nextInt();
//        }
//           //output
//            int x= sc.nextInt();
//
//            for (int i=0;i<number.length;i++){
//                if (number[i]==x){
//                    System.out.println("x found at index:" + i);
//                }
//            }

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int numbers[] = new int[size];

            for(int i=0; i<size; i++) {
                numbers[i] = sc.nextInt();
            }

            //print the numbers in array
            for(int i=0; i<numbers.length; i++) {
                System.out.print(numbers[i]+" ");
            }
        }

}
