package javaFundamental;

public class Method {
    public static void printJava() {
        System.out.println("Hello Java");
    }

    public static void printName(String name) {
        System.out.println(name);
    }

    public static void printSum(int a,int b){
        int sum =a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        printJava();
        printName("Stuti");
       printSum(1,3);
    }
}
