package javaFundamental;

public class SwitchStatement {
    public static void main(String[] args) {
             int day =2;  // 1-sunday ;2-Monday
        switch (day){
            case 1:
                System.out.println("Monday");
                break; // if will not use break then print all output after condition is correct
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("thu - Sun");
        }
    }
}
