package BitManipulation;

public class SetBitManipulation {
    public static void main(String[] args) {
        //agar bit mask me or perform hoga 1 position pr one hai to original number pr hamesha ek jagah 1 aayega
          int n=5;
          int pos =1;
          int bitMask = 1<<pos;

          int newNumber = (bitMask | n);
        System.out.println(newNumber);
    }
}
