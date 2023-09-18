package _06_LOOPS;

public class PATTERN3 {
    public static void main(String[] args) {

        // pattern 1

        for (int a= 1;a<=5;a++)
        {
            for(int d = 1;d<=5;d++)
            {
                if(d>=a)
                {
                    System.out.print(d+""); //if we add another space in it then it will form the inverted triangle
                }else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        // pattern 2

        for(int b= 5;b>=1;b--)
        {
            for(int e = 1;e<=5;e++)
            {
                if(e>=b)
                {
                    System.out.print("*"+""); //if we add another space in it then it will form the triangle
                }else
                {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }

        String sre = "new";
        
    }
}
