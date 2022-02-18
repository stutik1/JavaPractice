package OOPs;

class StudentDetails{
    String name;
    int age ;

    public void PrintInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // Parameterized Constructor
    StudentDetails(String name , int age){
        this.name = name ;
        this.age = age;
    }
}

public class ParametizedConstructor {
    public static void main(String[] args) {
        StudentDetails s1 = new StudentDetails("Stuti",25);
        s1.PrintInfo();
    }
}
