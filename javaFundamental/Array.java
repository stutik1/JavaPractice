package javaFundamental;

public class Array {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 80;
        marks[1]= 90;
        marks[2] =95;
        System.out.println(marks[0]);

        //// not initialize int /////
        int[] marks1 = new int[3];
//               marks[0] = 80;
//               marks[1]= 90;
//               marks[2] =95;
        System.out.println(marks1[0]);

        /////// boolean///////

        boolean[] num =new boolean[3];
//                 num[0] = 80;
//                 num[1] = 80;
//                 num[2] = 80;
        System.out.println(num[0]);   //  agar humne initialize nhi kiya to ye apne aap initialise ho jata hai bollean= true/false  int===0 value  and other null these all  are garbage value


        /////////////// String //////////
        String[] num1 =new String[3];
        num1[0] = "a";
        System.out.println(num1[0]);  //
    }
}
