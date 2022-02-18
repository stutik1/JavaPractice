package Recursion;

public class FirstLastOccurrenceOfElement {
    public static int first = -1;
    public static int last = -1;
    public static void firstLastOccurrenceOfElement(String str, int ind,char element){
        if(ind == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char CurrentChar = str.charAt(ind);
        if(CurrentChar == element) {
            if (first == -1) {
                first = ind;
            } else {
                last = ind;
            }
        }
        firstLastOccurrenceOfElement(str,ind+1 ,element);
    }
    public static void main(String[] args) {
        String str = "abcdaabfah";
        firstLastOccurrenceOfElement(str,0,'a');
    }
}
