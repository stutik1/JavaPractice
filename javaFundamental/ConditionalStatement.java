package javaFundamental;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // pen =10;  notebook =40

        int cash = sc.nextInt();
        if(cash<10){
            System.out.println("can't buy anythings");
            System.out.println("get more cash");
        }
        else if(cash > 10 && cash < 50){
            System.out.println("can buy only 1 thing");
        }
        else{
            System.out.println("can buy both things");
        }
    }
}
