package Recursion;

public class FactorialOfNumber {
    public static int printFactorial(int n) {
        if (n==1 || n==0){
            return 1;
        }
        int num = printFactorial(n - 1);
        int factorial = n * num;
        return factorial;
    }
    public static void main(String[] args) {
        int n=5;
        int ans = printFactorial(n);
        System.out.println(ans);
    }
}
