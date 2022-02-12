package JavaDSA;

import java.util.Scanner;

public class TableNumberbyLoop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();

        for(int i=1;i<11;i++){
            System.out.println(number*i);
        }
    }
}
