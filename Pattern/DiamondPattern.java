package Pattern;

public class DiamondPattern {
    public static void main(String[] args) {
        int n=4;

        // UPPER HALF
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int stars = 2*i-1;
            for (int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
           // LOWER HALF
        for (int i=n;i>=1;i--){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int stars = 2*i-1;
            for (int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
