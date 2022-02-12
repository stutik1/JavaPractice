package Strings;

public class StringBuilderMethod {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Megha");
        System.out.println(sb);

        // char at index
        System.out.println(sb.charAt(0));

        // insert at index
        sb.insert(0,"Stuti");
        System.out.println(sb);

        // set char at index
        sb.setCharAt(1,'S');
        System.out.println(sb);

     // delete the element
        sb.delete(0,5);
        System.out.println(sb);
    }

}
