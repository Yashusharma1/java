package _04_STRING_AND_PRINTING;

public class STUDENT_CHALLENGE_1 {
    public static void main(String[] args) {
        /*
        * CHECK IF THE NUMBER IS BINARY OR NOT
        * CHECK IF THE NUMBER IS HEXADECIMAL OR NOT
        * CHECK IF THE DATE IS IN THE DATE FORMAT (dd/mm/yyyyy)
        * */

        int i = 101010;

        // TO CHECK THE FIRST WE HAVE TO CONVERT IT INTO BINARY FORM

        String str = String.valueOf(i);

        if(str.matches("[0-1]*")){
            System.out.println("THE NUMBER IS BINARY ");
        }else{
            System.out.println("THE NUMBER IS NOT BINARY");
        }

        // TO CHECK IS THE NUMBER IS HEXADECIMAL OR NOT

        String str1 = "10101ABDE";

        if(str1.matches("[0-9A-F]*")){
            System.out.println("THE NUMBER IS HEXADECIMAL");
        }else{
            System.out.println("THE NUMBER IS NOT HEXADECIMAL");
        }

        // TO CHECK IF THE NUMBER IS IN DATE FORMAT

        String str3 = "12/09/2999";

        if(str3.matches("[0-2][0-9]/[0-1][0-9]/[0-9]{4}")){
            System.out.println("tTHE NUMBER IS IN THE DATE FORMAT ");
        }
        else{
            System.out.println("THE NUMBER IS NOT IN THE DATE FORMAT ");
        }
    }
}
