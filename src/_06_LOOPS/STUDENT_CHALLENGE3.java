package _06_LOOPS;

public class STUDENT_CHALLENGE3 {
    public static void main(String[] args) {
/*        // DISPLAY AP SERIES

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER ");
        int a = sc.nextInt();
        System.out.println("ENTER THE DIFFERENCE: ");
        int b = sc.nextInt();

        for (int i = 1;i<10;i++)
        {
            a = a + b;
            System.out.println(a);
        }

        // DISPLAY THE GP SERIES

        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER ");
        int aC = sc.nextInt();
        System.out.println("ENTER THE DIFFERENCE: ");
        int bC = sc.nextInt();

        for (int iC = 1;iC<10;iC++)
        {
            aC = aC * bC;
            System.out.println(aC);
        }
*/
        // FIBONACI SERIES

        int c = 0;
        int d = 1;
        System.out.println(c);
        System.out.println(d);
        int f=c;
        for(int e = 1 ; e<16;e++)
        {

            f = c +d;
            System.out.println(f);
            c=d;
            d=f;

        }

    }
}
