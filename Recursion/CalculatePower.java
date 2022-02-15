package Recursion;

public class CalculatePower {
    public static int calculatePower(int x,int n){
        if(n==0 ){   //Base Case 1
            return 1;
        }
        if(x==0){   //Base Case 2
            return 0;
        }
        int xPown1 = calculatePower(x,n-1);
        int xPowN = x * xPown1;
        return xPowN;
    }
    //////////////////// PRINT x^n (Stack Height = logn ) ////////////////////////////////
    public static int CalculateNumberMethod2( int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        // if n is even
        if(n%2==0){
            return CalculateNumberMethod2(x,n/2) * CalculateNumberMethod2(x,n/2);
        }
        else {
            return CalculateNumberMethod2(x,n/2) * CalculateNumberMethod2(x,n/2) * x;
        }

    }


    public static void main(String[] args) {
        int x=2;
        int n=5;
       int Pow = CalculateNumberMethod2(x,n);
        System.out.println(Pow);

    }
}
