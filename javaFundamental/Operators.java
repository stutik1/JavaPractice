package javaFundamental;

public class Operators {
    public static void main(String[] args) {
///////////////  Arithmetic ( * / % + - )   /////////////////
        int a=5;
        int b =3;
        int sum =a+b;
        int diff =a-b;
        int mul =a*b;
        int div =a/b;
        int modulo =a%b;
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(modulo);

        ///  Assignment  = += -= *= /= %= &= ^= |= <<= >>= >>>=

/////////////////////////// Unary Operator////////////////////////////////

        int numb=1;
       // numb = numb+1; numb++;

        System.out.println(++numb);
        System.out.println(numb);

        System.out.println(--numb);
        System.out.println(numb);


//////////////////////////////// Comparison operator //////////////////

        //a==b
        // a!=b
        //a<b
        //a>b
        //a<=b
        //a>=b

////////////////// Logical Operator //////////////////
       // logical AND	&&
       //  logical OR	||


        int c =30;
        int d =40;

        if(c<50 && d<50)
            System.out.println("both is less than 50");

        if(c <50 || d <50)
            System.out.println("atleast 1 is more then 50");

        boolean isAdult = false;
        if(!isAdult)
            System.out.println("is Adult");
        else
            System.out.println("not adult");
    }
}
