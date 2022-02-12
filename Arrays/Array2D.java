package Arrays;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows =sc.nextInt();
        int column = sc.nextInt();
        int number[][] = new int[rows][column];

        // input

        for (int i=0;i<rows;i++){    // row
            for (int j=0;j<column;j++){  // column
               number[i][j] = sc.nextInt();
            }
        }
              //output
        for (int i=0;i<rows;i++){
            for (int j=0;j<column;j++){
                System.out.print(number[i][j]);
            }
            System.out.println();
        }

    }
}
