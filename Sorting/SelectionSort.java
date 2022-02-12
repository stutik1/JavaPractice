package Sorting;

public class SelectionSort {
    public static void printArray(int arr[] ) {
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr= {1,9,10,6,5};

        // Selection Sort (one swap for 1 iteration)
        for(int i=0;i<arr.length-1;i++){
            int smallest =i;
            for (int j=i+1;j< arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            //swap
            int temp =arr[smallest];
            arr[smallest]=arr[i];
            arr[i] =temp;
        }
        printArray(arr);
    }
}
