package _07_ARRAY;

import java.util.Scanner;

public class STUDENT_CHALLENGE1 {
    public static void main(String[] args) {
        // FIND THE SUM OF ALL THE ELEMENT OF THE ARRAY
        Scanner src = new Scanner(System.in);
        System.out.println("enter the element of the array");
        int a[] = new int[5];

        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = src.nextInt();
        }

        int sum = 0;

        for (int j = 0; j <= a.length - 1; j++) {
            sum = sum + a[j];
        }

        System.out.println("THE SUM OF ALL THE ELEMENT OF THE ARRAY IS " + sum);


        // SEARCHING THE ELEMENT
        System.out.println("enter the number");
        int d = src.nextInt();

        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] == d) {
                System.out.println("the number is found");
                break;
            } else {
                System.out.println("the number is not found");
                break;
            }
        }
        {
            // FIND THE MAXIMUM ELEMENT AND THE SECOND LARGEST ELEMENT
            int max=a[0];
            int max2=a[0];
            for (int c=1; c<=a.length-1;c++)
            {
                if (a[c]>=max)
                {
                    max2=max;
                     max=a[c];
                }
                else if(a[c]>=max2)
                {
                    max2=a[c];
                }
            }
            System.out.println(max);
            System.out.println(max2);
        }

    }
}