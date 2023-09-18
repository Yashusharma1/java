package _05_CONDITIONAL_STATEMENT;

import java.util.Scanner;

public class RADIX {
    public static void main(String[] args) {
        // TO FIND THE RADIX NUMBER
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");

        String str = sc.nextLine();

        if(str.matches("[0-1]*")){
            System.out.println("the number is binary");
        }else if(str.matches("[0-9A-F]*")){
            System.out.println("the redix is in hexadecimal form");
        }else if (str.matches("[0-9]*")){
            System.out.println("the redix of the number is octal");
        }else {
            System.out.println("the redix of the number is invalid");
        }


        // LEAP YEAR

        Scanner src1 = new Scanner(System.in);
        int a = src1.nextInt();

        if (a%4==0)
        {
            if (a%100==0)
            {
                if (a%400==0)
                {
                    System.out.println("THE YEAR IS THE LEAP YEAR");
                }else
                {
                    System.out.println("THE YEAR IS NOT A LEAP YEAR");
                }
            }else
            {
                System.out.println("THE YEAR IS NOT A LEAP YEAR");
            }
        }else
        {
            System.out.println("THE YEAR IS NOT A LEAP YEAR");
        }

    }
}
