package Pattern;

import java.util.Scanner;

public class SolidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y=sc.nextInt();

        for (int i=1;i<=x;i++){
            for (int j=1;j<=y;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
