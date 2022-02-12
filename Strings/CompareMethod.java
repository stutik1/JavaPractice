package Strings;

import java.util.Scanner;

public class CompareMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String name1 = sc.nextLine();

        // 3 cases of compareTo method
        //1. s1 > s2 : +ve value
        //2. s1 = s2 : 0
        //3. s1 < s2 : -ve value

        if(name.compareTo(name1)==0){
            System.out.println("Strings are Equal");
        }else{
            System.out.println("Strings are not Equal");
        }
    }
}
