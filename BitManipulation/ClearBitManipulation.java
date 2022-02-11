package BitManipulation;

public class ClearBitManipulation {
    public static void main(String[] args) {

        //BitMask : 1<<i
        //Operation : AND with NOT bitwise
        // first find the NOT of bitmask after that find AND with original number

        int n=6;
        int pos=2;
        int bitMask = 1<<pos;

        int notBitMask = ~(bitMask);
        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }
}
