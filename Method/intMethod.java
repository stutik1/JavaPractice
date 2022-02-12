package Method;

import java.util.Scanner;

public class intMethod {
    public static int Duplicate(int[] a) {
        int repeateNumber=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    repeateNumber=a[j];
                }
            }
        }
        return repeateNumber;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         int [] a= { 1,2,2,3,4};
       // int[] a= sc.nextInt();
        System.out.println(Duplicate(a));
    }

}
