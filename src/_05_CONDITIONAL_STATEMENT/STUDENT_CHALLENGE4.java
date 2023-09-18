package _05_CONDITIONAL_STATEMENT;

import java.util.Scanner;

public class STUDENT_CHALLENGE4
{
    public static void main(String[] args)
    {
        // MENU DRIVEN PROGRAM FOR THE ARTHRITIC OPERATOR

        Scanner src = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER");
        int a = src.nextInt();
        System.out.println("ENTER THE SECOND NUMBER");
        int  b = src.nextInt();
src.nextLine();
        System.out.println("ENTER THE OPTION YOU WANT TO ENTER");
       String sc = src.nextLine();

        switch (sc)
        {
            case "ADD": System.out.println("THE ADDDITION OF THE TWO NUMBER IS :"+(a+b));
                break;
            case "MUL": System.out.println("THE MULTIPLICATION OF THE TWO NUMBER IS :"+(a*b));
                break;
            case "SUB": System.out.println("THE SUBTRACTION OF THE TWO NUMBER IS :"+(a-b));
                break;
            case "DIV": System.out.println("THE DIVISION OF THE TWO NUMBER IS :"+(a/b));
                break;
            default: System.out.println("THE MODULUS OF THE TWO NUMBER IS :"+(a%b));
                break;
        }

    }
}
