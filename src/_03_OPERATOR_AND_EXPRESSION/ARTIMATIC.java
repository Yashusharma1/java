package _03_OPERATOR_AND_EXPRESSION;

public class ARTIMATIC {
    public static void main(String[] args){
        /*
        * (BYTE + SHORT), (BYTE + BYTE),(INT+ INT),(SHORT +SHORT)
        * THESE ALL WIL GIVE THE RESULT IN THE INT FORMAT
        * (CHAR+INT) WILL GIVE THE RESULT IN THE INT FORMAT
        * */

        byte c = 10;
        byte b = 10;
        int a = c+b;
         char e = 10;
          int x = 30;
             int f = e+x;
        System.out.println(a);
        System.out.println(f);

    }
}
