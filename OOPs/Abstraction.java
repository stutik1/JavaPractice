package OOPs;

 abstract class Animal{
    abstract void walk();
    public void eat(){
        System.out.println("Animal eats");
    }
}
class Horse extends Animal{
    public  void walk(){
        System.out.println("Walk 4 legs");
    }
}
class Chicken extends Animal{
    public  void walk(){
        System.out.println("Walk 2 legs");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
    }
}
