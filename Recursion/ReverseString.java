package Recursion;

public class ReverseString {
    public static void reverseString(String str,int ind){
        if(ind ==0){
            System.out.println(str.charAt(ind));
            return;
        }
        System.out.print(str.charAt(ind));
        reverseString(str,ind-1);
    }
    public static void main(String[] args) {
        String str = "Stuti";
        reverseString(str,str.length()-1);
    }
}
