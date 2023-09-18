package _02_DATA_TYPES;

public class LITERALS {
    public static void main(String[] args)
    {
        int b = 10;
        int a = 2*b + 4*5;
        /*
        * IN 2ND LINE WE HAVE THREE LITERALS THAT ARE 2,4,5
        *  THESE LITERALS HAVE DATA TYPES
        *  AS IN THIS ITS DATA TYPE IS INT
        * */

        /*
        *  WE WILL USE HOW TO STORE DATA IN THE BINARY FORMAT
        * FOR BINARY WE START WITH 0b
        * FOR OCTAL WE CAN START WITH 0
        * AS FOR THE HEXADECIMAL WE START WITH 0X AND X CAN BE CAPTITAL OR SMALL
        *  */

        int c = 0b1010; // NUMBER WILL BE IN THE BOOLEAN
        int d = 0xA;    // NUMBER WILL BE IN THE OCTAL
        int e = 012;    // NUMBER WILL BE IN THE HEXADECIMAL
        int f = 10;     // NUMBER WILL BE IN THE DECIMAL

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);


    }

}
