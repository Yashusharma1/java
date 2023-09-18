package _06_LOOPS;

public class PATTERN1 {
    public static void main(String[] args) {
        for(int i = 1 ;i <=5;i++)
        {
            for(int e = 1;e<=5;e++)
            {
                System.out.print(e+ " ");
            }
            System.out.println("");
        }

        System.out.println("");

        // 2ND PATTERN

        for(int i = 1 ;i <=5;i++)
        {
            for(int e = 1;e<=5;e++)
            {
                System.out.print(i+ " ");
            }
            System.out.println("");
        }

        System.out.println("");

        // 3RD PATTERN

        for(int i = 1 ;i <=5;i++)
        {
            for(int e = 1+i;e<=5+i;e++)
            {
                System.out.print(e+ " ");
            }
            System.out.println("");
        }

        System.out.println("");

        // 4th pattern

        int cout = 0;
        for(int i = 1 ;i <=5;i++)
        {
            for(int e = 1+i;e<=5+i;e++)
            {
                System.out.printf("%02d ",++cout);
            }
            System.out.println("");
        }

    }
}
