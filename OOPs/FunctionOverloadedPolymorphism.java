package OOPs;
class StudentDetail{
    String name;
    int age ;
   public void PrintInfo(String name){
       System.out.println(name);
   }
    public void PrintInfo(int age) {
        System.out.println(age);
    }
    public void PrintInfo(String name ,int age) {
        System.out.println(name + " " + age);
    }
}
public class FunctionOverloadedPolymorphism {
    public static void main(String[] args) {
        StudentDetail s1 = new StudentDetail();
        s1.name = "Stuti";
        s1.age= 25;

        s1.PrintInfo(s1.name , s1.age );
    }
}
