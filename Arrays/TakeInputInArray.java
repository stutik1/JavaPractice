package Arrays;

import java.util.Scanner;

public class TakeInputInArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        // Input
          for(int i=0;i<size;i++ ){
              number[i] = sc.nextInt();
          }
          // OUTPUT
        for (int i=0;i<size;i++){
            System.out.println(number[i]);
        }
    }
}
