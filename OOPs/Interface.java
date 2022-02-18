package OOPs;
interface Animals{
    int eye=2;
    void walk();
}
interface Herbivore{

}
class Cow implements Animals,Herbivore{
    public void walk(){
        System.out.println("Walk 4 legs");
    }
}
public class Interface {
    public static void main(String[] args) {
        Cow cow=new Cow();
        cow.walk();
    }
}
