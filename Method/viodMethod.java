package Method;

public class viodMethod {
        public static void main(String[] args ){
        int[] a= new int[]{1,2,2,3,4};
        for(int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println(a[j]);
                }
            }
        }
    }
}
