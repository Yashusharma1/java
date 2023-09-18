package _02_DATA_TYPES;

public class INTEGER_TO_FLOAT {
    public static void main(String[] args)
    {
        /*
        * IN THIS WE CONVERT THE INTEGER INTO THE BINARY FORMAT
        * BYTE AND SHORT CAN BE CONVERTED INTO THE BINARY
        *  BUT FIRST WE HAVE TO CONVERT SHORT AND BYTE INTO THE INTEGER
        * FLOAT CANNOT BE CONVERTED INTO THE BINARY FORM
        * TO CONVERT INTO THE BINARY WE USED toBinaryString(any number)
        * Same for Hex , Octal just replace it with the Binary
        * */

         int a = 10;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toHexString(a));
    }

}
