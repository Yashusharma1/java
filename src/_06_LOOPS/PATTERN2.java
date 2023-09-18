package _06_LOOPS;

public class PATTERN2 {
    public static void main(String[] args) {

        System.out.println("this is the pattern 1");

        for (int i=1;i<=5;i++)
        {
            for (int j =1;j<=i;j++)
            {
                System.out.print(" "+j+" ");
            }
            System.out.println("");
        }

        System.out.println("");

        System.out.println("this is the pattern 2");

        int c =0;
        for (int i=1;i<=5;i++)
        {
            for (int j =1;j<=i;j++)
            {
                System.out.print(++c + " ");
            }
            System.out.println("");
        }

        System.out.println("");

        System.out.println("this is the pattern 3");

        for (int k=5;k>=1;k--)
        {
            for (int h =1;h<=k;h++)
            {
                System.out.print(h + " ");
            }
            System.out.println("");
        }

        System.out.println("this is the pattern 4");


    }
}
