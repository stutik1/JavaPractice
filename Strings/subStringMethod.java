package Strings;

public class subStringMethod {
    public static void main(String[] args) {

        //subString(starting index ,Ending index)  not consider the ending index value

        String sentence = "My name is Megha";
        //String name = sentence.substring(11,sentence.length());
      //  String name = sentence.substring(11); // not necessary to write ending index if we want to print ending element of the sentence
        String name = sentence.substring(11,14);
        System.out.println(name);
    }
}
