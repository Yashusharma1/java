package _06_LOOPS;

import java.util.Scanner;

public class STUDENT_CHALLENGE2 {
    public static void main(String[] args) {
        // DISPLAY THE DIGIT
        Scanner src = new Scanner(System.in);
        int i = src.nextInt();
        int z = i;
        int sum = 0;
        while(i!=0)
        {
               sum = sum*10+i%10;
               i = i/10;
        }

        System.out.println("the reverse of the number is :"+sum);

        if (z==sum){
            System.out.println("the number is palendom");
        }else{
            System.out.println("the number is not a palendrome number");
        }

        int a = 0,b=0,c=0;
        while (sum!=0)
        {
            a = sum%10;
            c = c + (a*a*a);
            sum = sum/10;
            b++;
            System.out.println("the digits are :"+a);
        }

        System.out.println("the number of count are :"+b);

        if (z==c)
        {
            System.out.println("the armstrong number is :");
        }else {
            System.out.println("the number is not a armstrong number");
        }

    }
}
