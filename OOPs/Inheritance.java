package OOPs;
class Shape{
    public void area(){
        System.out.println("dilay name");
    }
}
class Triangle extends Shape{
       public void area(int l,int b){
    System.out.println(1/2*l*b );
   }
}
class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}

public class Inheritance {
    public static void main(String[] args) {
//        Triangle t1 = new Triangle();
//        t1.color ="Red";

    }
}
