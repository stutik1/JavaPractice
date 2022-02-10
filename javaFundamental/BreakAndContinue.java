package javafundamental;

public class BreakAndContinue {
    public static void main(String[] args) {
        int i=0;
        while(true){    ///always while loop run
            if (i==3){  // jb i =3 to wo print nhi hoga wo skip ho jayega
                i=i+1;
                continue;
            }
            System.out.println(i);
            i=i+1;
            if(i>5){
                break;
            }
        }
    }
}
