package _03_OPERATOR_AND_EXPRESSION;

public class IncDec {
    public static void main(String[] args) {
        //IN THIS WE PERFOM INCREMENT AND DECREMENT OPERATION

        int a =10;
        int b=12;

        int c = 2*a++ + 3*++a ; // IN THIS FIST  THE A WHICH IS 10 IS MULTIPLIED BY 2 THEN IT IS INCRESMENTED BY 1 AND AFTER THIS IT IS INCREMENTFED BY 1 AGAIN THEN MULTIPLIED BY 3

        int d = 2*a++ + 4*++b;
        System.out.println(c);
        System.out.println(d);
       float e = 1.2f*a++;  // IT IS APPLICABLE TO THE FLOAT ALSO
       System.out.println(e);

    }
}
