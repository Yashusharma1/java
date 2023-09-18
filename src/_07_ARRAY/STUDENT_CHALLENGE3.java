package _07_ARRAY;

import java.util.Scanner;

public class STUDENT_CHALLENGE3 {
    public static void main(String[] args)
    {

        // ADDITION OF THE TWO MATRIX

        int a[][] = new int[2][2];

        Scanner src = new Scanner(System.in);
        for (int i = 0;i<a.length;i++)
        {
            for (int j=0;j<a[0].length;j++)
            {
            a[i][j] = src.nextInt();
            }
        }
int b[][] = new int[2][2];
        for (int k = 0;k<a.length;k++)
        {
            for (int l=0;l<a[0].length;l++)
            {
                b[k][l] = src.nextInt();
            }
        }

        int c[][] = new int[2][2];
/*
        for(int m= 0;m<c.length;m++){
            for(int n = 0;n<c.length;n++){
                c[m][n] = a[m][n]+b[m][n];
            }

        }

        for (int d[]:c
             ) {
            for (int x:d
                 ) {
                System.out.print(x+" ");
            }
            System.out.println("");
        }
*/
        // MULTIPLICATION OF THE MATRIX



    }
}
