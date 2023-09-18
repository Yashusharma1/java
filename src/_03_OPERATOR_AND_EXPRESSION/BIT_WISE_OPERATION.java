package _03_OPERATOR_AND_EXPRESSION;

public class BIT_WISE_OPERATION {
    public static void main(String[] args)
    {
         /*BIT WISE OPERATION INCLUDE
         1:  AND (&),(|)OR,(~)NOT,(^)XOR,(<<)LEFTSHIFT AND RIGHTSHIFT(>>)
         2:  PERFORMING << ON THE NUMBER MEANS MUTIPLYING IT BY THE
             2 IF THE SHIFT IS DONE BY THE ONE TIME SO IT EQUALS TO
             NUMBER * 2^(NUMBER OF TIME SHIFT DONE)
         3: AS FOR THE >> IT WILL EQUALS TO NUMBER/(2^NUMBER OF TIME RIGHT SHIFT PERFORMED

          * */

        // AND OPERATION
        int a = 10;
        int b = 12;
        int c = a&b;
        System.out.println(c);
        // OR OPERATION
        int d = a|b;
        System.out.println(d);
        //XOR OPERATION
        int e = a^b;
        System.out.println(e);
        // NOT OPERATION
        int f = ~a;  // NUMBER WILL BE ALWAYS BE OPPOSITE AND 1 GREATER THAN THE NUMBER
        System.out.println(f);
        // LEFT SHIFT OPERATION
        int g = a<<2; // AS NUMBER IS LEFT SHIFT BY 2 SO IT WILL MULTIPLIED BY 2^2*10;
        System.out.println(g);
        // RIGHT SHIFT OPERATION
        int h = a>>2; // AS NUMBER IS RIGHT SHIFT BY 2 IT WILL BE DIVIDED BY 2^2 SO IT WILL BE 5
        System.out.println(h);



    }
}
