package _03_OPERATOR_AND_EXPRESSION;

public class SWAPPING {
    public static void main(String[] args)
    {
        // WE WILL SWAP THE TWO NUMBER USING MERGING AND MASKING OR WE CAN SAY SWAPPING WITHOUT THE THIRD VARIABLE
        int a = 9;
        int b = 12;

        a = a^b;
        b = a^b;
        System.out.println(b);
        a = a^b;
        System.out.println(a);
        //  AS WE KNOW THE XOR OF TWO NUMBER CANNOT BE GREATER THAN THE TWO NUMBER IT WILL ALWAYS BE BETWEEN THEM

        // MERGING

        byte g = 9;
        byte h = 12;
        int i;

        i =  g<<4;
        i = i|h;

        System.out.println(Integer.toBinaryString(i));

        // MASKING
        System.out.println(i&0b000001111);
        System.out.println(i>>4&00001111);






    }
}
