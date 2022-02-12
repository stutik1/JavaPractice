package Strings;

public class ReverseStringByStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Megha");

        for (int i=0;i<sb.length()/2;i++) {
            int front = i;
            int back = sb.length() - 1 - i;  //5(length of an array )- 1- 0(index of an array )

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);

        /////////////// Another way /////////////
        String input = "Stuti";
        StringBuilder input1 = new StringBuilder("");

        input1.append(input);
        input1.reverse();
        System.out.println(input1);
    }
}
