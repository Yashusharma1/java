package _06_LOOPS;

import java.util.Scanner;

public class STUDENT_CHALLENGE1 {
    public static void main(String[] args) {
        // TABLE OF 5


        for(int a = 1; a<=10; a++){
            int  i = 5*a;
            System.out.println(5+"x"+a+"="+i);
        }

        // SUM OF FIRST 10 NATURAL NUMBER

        int b = 0;
        for(int x = 1; x<=10; x++){
            b = b+x;

        }
        System.out.println(b);

        // factorial of the number

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number want to be factorial");
        int r = sc.nextInt();
        int sum = 1;
        for(int t = 1;t<=r;t++)
        {
            sum = sum*t;

        }
        System.out.println("the factorial of the number is:"+sum);
    }
}
