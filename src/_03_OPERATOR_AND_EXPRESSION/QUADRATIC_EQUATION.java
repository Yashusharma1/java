package _03_OPERATOR_AND_EXPRESSION;
import java.util.*;


public class QUADRATIC_EQUATION {
    public static void main(String[] args)
    {
        // WE WILL CALCUALTE THE ROOTS OF THE QUADRATIC EQUATION
        Scanner sc = new Scanner(System.in);
       System.out.println("ENTER THE NUMBER");
       float a = sc.nextFloat();
        System.out.println("ENTER THE NUMBER");
        float b = sc.nextFloat();
        System.out.println("ENTER THE NUMBER");
        float c = sc.nextFloat();

        double d = (-b+Math.sqrt(b*b-4*a*c))/(2*a);// WE USED DOUBLE BECAUSE THE MATH.SQRT ALWAYS RETURN DOUBLE
        Double E = (-b-Math.sqrt(b*b-4*a*c))/(2*a);

        System.out.println("THE ROOTS OF THE QUADRATIC EQUATION ARE "+d);
        System.out.println("THE ROOTS OF THE QUADRATIC EQUATION ARE "+E);
    }


}
