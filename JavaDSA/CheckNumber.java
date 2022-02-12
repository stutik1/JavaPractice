package JavaDSA;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y = sc.nextInt();

        if(x==y){
            System.out.println("Equal");
        }
        else if(x>y){
            System.out.println("x is greater");
        }
        else {
            System.out.println("x is smaller");
        }
    }
}
