package _04_STRING_AND_PRINTING;

public class QUANTIFIER {
    public static void main(String[] args) {
        /*
        * (*) MEANS 0 OR MORE TIME
        * (+) MEANS 1 OR MORE TIME
        * (?) MEANS 0 OR 1
        * {x} MEANS X TIMES CORRECTLY
        * {X,Y}BETWEEN X AND Y
        * */

        String str = "My name is ben";
        System.out.println(str.matches(".*"));
        System.out.println(str.matches("[a-zA-Z0-9]+"));
        String str1 = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(str1.matches("[a-z]{26}"));
        String str2 = "my name is ben10";
        System.out.println(str2.matches("[a-z]{1,50}"));

        
    }

}
