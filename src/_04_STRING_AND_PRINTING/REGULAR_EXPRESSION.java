package _04_STRING_AND_PRINTING;

public class REGULAR_EXPRESSION {
    public static void main(String[] args) {
        /*
        * REGULAR EXPRESSION
        * [ABC] MEANS THAT IT CAN BR A,B,C BUT ONLY ONE TIME
        * [^ABC] MEANS EXCEPT A,B,C IT CAN BE ANYTHING BUT ONLY ONE TIME
        * [A-Za-z1-0] MEANS IT CAN BE ANYTHING BUT ONLY ONE TIME
        * A|B MEANS EITHER A OR B
        * AZ MEANS EXCATLY AZ ONLY
        * \\d MEANS DIGIT
        * \\D MEANS NOT A DIGIT
        * \\s NOT A SPACE
        * \\S MEANS SAPCE
        * \\w ALPHABET AND DIGIT
        * \\W NOT ALPHABET AND DIGIT
        * . anything but one single time
        * */


        String str = "n";
        System.out.println(str.matches("."));

        String str1 = "S";
        System.out.println(str1.matches("[ABS]"));

        System.out.println(str.matches("[^ABC]"));

        System.out.println(str.matches("[A-Za-z1-9]"));

        System.out.println(str.matches("A|B"));

        System.out.println(str.matches("XY"));

        System.out.println(str.matches("\\d"));

        System.out.println(str.matches("\\D"));

        System.out.println(str.matches("\\s"));

        System.out.println(str.matches("\\S"));

        System.out.println(str.matches("\\W"));

        System.out.println(str.matches("\\w"));

    }

}
