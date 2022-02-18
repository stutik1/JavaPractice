package Pattern;

public class InvertedHalfPyramidWithNumber {
    public static void printInvertedHalfPyramid(int n) {
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void printInvertedHalfPyramidMethod2(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
       printInvertedHalfPyramid(n);
    }
}
