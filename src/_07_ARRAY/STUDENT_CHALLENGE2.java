package _07_ARRAY;

import java.util.Scanner;

public class STUDENT_CHALLENGE2 {
    public static void main(String[] args) {
        // ROTATION OF THE ARRAY

        Scanner src = new Scanner(System.in);

  /*      int a[] = new int[10];
        for (int i = 0;i <=a.length-1;i++)
        {
            a[i] = src.nextInt();
        }
        int b = a[0];
        for (int j = 0;j<=a.length-2;j++)
        {
            a[j] = a[j+1];
        }
        a[a.length-1] = b;

        for (int z:a
             ) {
            System.out.println(z
            );
        }

  */      // INSERTING THE ELEMENT

       int e[] = new int[10];
       e[1]=12;
       e[2]=13;
       e[3]=14;
       e[4]=15;
       e[5]=16;
        System.out.println("enter the index number");
        int c = src.nextInt();

        System.out.println("enter the  number");
        int d = src.nextInt();
       int n = 6;
       for (int i = 6;i>c;i--)
       {
           e[i]=e[i-1];
       }
       e[c]= d;
        for (int z: e
             ) {
            System.out.println(z);
        }
    }
}
