package Arrays;

public class Array1D {
    public static void main(String[] args) {
        int marks[] =new int[3];
        marks[0]=98;
        marks[1]=99;
        marks[2]=96;

//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);

        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

       ///////////////////////Another way if we know the size of an array ////////////////////////

        int mark[]= {87,88,89};
        for (int i=0;i<marks.length;i++){
            System.out.println(mark[i]);
        }

    }
}
