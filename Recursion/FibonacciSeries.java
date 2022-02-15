package Recursion;

public class FibonacciSeries {
    public static void FibonacciSeriesByIteration(int a ,int b ,int n){
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(a + ", ");

            // compute the next term
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
    }
    public static void printFibonacciSeries(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        printFibonacciSeries(b,c,n-1);
    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=7;

        System.out.println(a);
        System.out.println(b);
        printFibonacciSeries(a,b,n-2);
        FibonacciSeriesByIteration(a,b,n);
    }
}
