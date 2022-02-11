package BitManipulation;

public class GetBitManipulation {
    public static void main(String[] args) {
        int n=5; // 0101
        int pos =2; //0100
        int bitMask= 1<<pos;

        if ((bitMask & n)==0){
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }
    }
}
