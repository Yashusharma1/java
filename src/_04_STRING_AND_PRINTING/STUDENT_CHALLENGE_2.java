package _04_STRING_AND_PRINTING;

public class STUDENT_CHALLENGE_2 {
    public static void main(String[] args) {
        /*
        * REMOVE SPECIAL CHARCTER FORM THE STRING
        * REMOVE EXTRA SPACES FROM THE STRING
        * COUNT NUMBER OF WORD IN THE STRING
        * */

        String str = "123@#$#adffv";

           // REGUALR EXPRESSION CAN BE USED WITH ALL THE METHODS OF THE STRING

        System.out.println(str.replaceAll("\\W",""));

        String str1 = "12  3   @#$  #    ad  ffv  ";

        System.out.println(str.replaceAll("\\s", ""));

        // FOR COUNTING THE NUMBER OF WORD
        String str3 = str.replaceAll("\\W","");
        str3 = str3.replaceAll("[0-9]*","");

        System.out.println(str3);
    }
}
