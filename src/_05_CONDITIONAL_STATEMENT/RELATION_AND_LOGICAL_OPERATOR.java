package _05_CONDITIONAL_STATEMENT;

public class RELATION_AND_LOGICAL_OPERATOR {
    public static void main(String[] args) {

        /*RELATIONAL OPERATOR
         *  <,>,!=,>=,<=
         *
         * LOGICAL OPERATOR ARE
         * && , ||  , !
         *
         * */

        int  a = 19;
        int b = 12;
        int c = 13;
        System.out.println(a<b);
        System.out.println(a>c);
        System.out.println(a>=b);
        System.out.println(a<=c);


        System.out.println(a>b && a >c);
        System.out.println(a>b||a<c);



        // GREATER OF THREE NUMBER

        int d = 10;
        int e = 23;
        int f = 19;

        if(d>e && d>f ){
            System.out.println("d IS GREATEST NUMBER");
        } else if (e>f) {
            System.out.println("e IS GREATEST NUMBER");
        }else {
            System.out.println("f IS THE GREATEST NUMBER ");
        }

    }
}
