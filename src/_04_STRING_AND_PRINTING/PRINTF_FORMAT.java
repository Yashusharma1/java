package _04_STRING_AND_PRINTING;

public class PRINTF_FORMAT {
    public static void main(String[] args) {
        /*
         * System.out.printf("%[argument Index$][flag][width][ .precision ]conversion", argument ):
         * argument Index - 1$,2$,3$;
         * conversion
         * char - c
         * int - d ,o ,x
         * String - s
         * float - f, e, g
         * */
        char s = 'A';
        int z = 10;
        System.out.printf("%c\n",s);
        System.out.printf("%d\n",z);// PRINT THE OUTPUT IN THE DECIMAL FORM
        System.out.printf("%o\n",z);// PRINT THE OUTPUT IN THE OCTAL FORM
        System.out.printf("%x\n",z);// PRINT THE OUTPUT IN THE HEXADECIMAL FORM
        String str= "My Name Is Yashu";
        System.out.printf("%s\n",str);// PRINT THE OUTPUT IN THE STRING FORMAT
        float f = 12.24f;
        System.out.printf("%f\n",f);// PRINT THE OUTPUT IN THE FLOAT FORM
        System.out.printf("%e\n",f);// PRINT THE OUTPUT IN THE SCIENTIFIC FORM
        System.out.printf("%g\n",f);// PRINT THE OUTPUT IN THE  FORM

        // ARGUMENT - argument Index - 1$,2$,3$;

        System.out.printf("%2$f, 1$d\n",z,f); // ARGUMENT INDEX LET US PRINT ANY NUMBER IN ANY PLACE WITH THE HELP OF THE ARGUMENT

        // WIDTH - IT HELP US TO DECIDE HOW MUCH PALCE DOES THE ARGUMENT TAKE

        System.out.printf("%3f\n",f);

        // PRECISION (.) - IT HELP US TO MAKE THE DECISION THAT HOW MUCH PLACE DOES THE ARUMENT TAKE AFTER THE POINT

        System.out.printf("%3.1f\n",f); // AS TOTAL DIGIT WILL BE 3 INCLUDING THE POINT AND 1 DIGIT AFTER THE POINT

        /*
        *  FLAGS -
        * '0' MEANS ALL THE REMAINING DIGIT WILL BE FILLED WITH THE ZERO
        * '+' HELP US TO PRINT THE SIGN OF THE NUMBER IF NEGATIVE THAN PRINT NUMBER WITH
        * THE NEGATIVE SIGN IF POSITIVE THEN WITH NO SIGN
        * '(' PRINT () WHEN THE NUMBER IS NEGATIVE
        * THERE ARE MORE FLAG THAN THIS
        * */
               float h = -12.1345f;

        System.out.printf("%(4.1f\n",h);
    }
}
