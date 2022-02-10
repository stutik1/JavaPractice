package javaFundamental;

public class StringMethod {
    public static void main(String[] args) {
        // String
        //concatenate
        String name1 ="Stuti";
        String name2 ="Megha";
        String name3 =name1 + " and " +name2;
        System.out.println(name3);

        // CharAt ( dekhna hai character kaun sa present hai kis position pr )
        String name ="Stuti";
        System.out.println(name.charAt(0));

        // length  (find the length )
        System.out.println(name.length());

        //replace
       String name4 ="Stuti";
       String changeName = name4.replace('S' ,'M');
        System.out.println(changeName);
        System.out.println(name4); // Original String not change bcz String is immutable . if we want new String then have to create new String to store the in new variable

        // subString
        String name5 = "Megha and Stuti";
        System.out.println(name5.substring(0,4));
    }
}
