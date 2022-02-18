package OOPs;

 class Pen {
     String color;
     String type; //ballpen ,gel

     public void write(){
         System.out.println("Write Something");
     }
     public void printColor(){
         System.out.println(this.color);
     }
}

  class Students{
     String name;
     int age;

     public void PrintInfo(){
         System.out.println(this.name);
         System.out.println(this.age);
     }
     //////Non Parametrized Constructor
     Students(){
         System.out.println("Constructor ");
     }
  }
  public class OPPS {
      public static void main(String[] args) {
          Pen pen1 = new Pen();
          pen1.color = "Blue";    //properties
          pen1.type = "BallPoint";

          Pen pen2 = new Pen();
          pen2.color = "Black";    //properties
          pen2.type = "gel";

          pen1.write();
          pen1.printColor();
          pen2.printColor();

          Students s1 = new Students();
          s1.name = "Stuti";
          s1.age = 25;

          s1.PrintInfo();
      }
  }