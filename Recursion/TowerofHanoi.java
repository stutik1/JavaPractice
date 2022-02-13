package Recursion;
//RULES
//1. Only 1 disk transferred in one step.
//Smaller disk are always kept on the top of larger disk.
//Number od Steps = (2^n -1)

public class TowerofHanoi {
    public static void TowerOfHanoiByRecursion(int n ,String src ,String helper,String dest){
        if(n==1){
            System.out.println("Transfer disk " + n +" from " + src + " to " + dest);
            return;
        }
        TowerOfHanoiByRecursion(n-1,src,dest,helper);
        System.out.println("Transfer disk " + n +" from " + src + " to " + dest);
        TowerOfHanoiByRecursion(n-1,helper,src,dest);
    }
    public static void main(String[] args) {
        int n =4;
        TowerOfHanoiByRecursion(n,"S","H","D");
    }
}
