package Recursion;

public class PrintNumber {
    public static void PrintNumberByIteration(int n) {
        for(int i=5;i>0;i--){
            System.out.println(i);
        }
    }
    public static void PrintNumberByRecursion(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        PrintNumberByRecursion(n-1);  // bcz number decrease by 1
    }
    public static void main(String[] args) {
        int n=5;
      // PrintNumberByIteration(n);
        PrintNumberByRecursion(n);
    }
}
