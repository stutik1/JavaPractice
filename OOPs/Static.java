package OOPs;
class StudentInfo{
    String name ;
    static  String school;
}
public class Static {
    public static void main(String[] args) {
        StudentInfo.school="DAV";
        StudentInfo student1= new StudentInfo();
        student1.name="Megha";
        System.out.println(student1.school);
        System.out.println(student1.name);
    }
}
