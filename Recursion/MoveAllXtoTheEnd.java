package Recursion;

public class MoveAllXtoTheEnd {
    public static  void moveAllX(String str,int ind ,int count, String newString){
        if (ind == str.length()){
            for (int i=0;i<count;i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(ind);
        if(currChar=='x') {
            count++;
            moveAllX(str, ind + 1, count, newString);
        }
      else {
          newString = newString+currChar;
            moveAllX(str,ind+1,count,newString);
        }
    }
    public static void main(String[] args) {
        String str = "asbxccx";
        moveAllX(str,0,0,"");
    }
}
