package Recursion;

public class CheckArrayIsSorted {
    public static boolean isSorted(int arr[] ,int ind){
        if( ind == arr.length-1){
            return true;
        }
        if(arr[ind] < arr[ind+1]){ // array is sorted till now
           return isSorted(arr,ind+1);
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] ={1,3,4,5,8};
        System.out.println(isSorted(arr,0));
    }
}
