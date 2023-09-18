package _06_LOOPS;

import java.util.Scanner;

public class NUMBER_TO_WORD {
    public static void main(String[] args) {
        // TO CONVERT THE LETTER TO THE WORD
        Scanner src = new Scanner(System.in);
        int a = src.nextInt();
        String str = "";
        int sum = 0;
        while(a!=0){
            sum = a%10;
            a = a/10;
           str = str + sum;
        }
        System.out.println(str);

        for (int i = str.length()-1;i>=0;i--){
           switch (str.charAt(i))
           {
               case '0' :
                   System.out.println("zero");
                   break;
               case '1' :
                   System.out.println("one");
                   break;
               case '2':
                   System.out.println("two");
                   break;
               case '3':
                   System.out.println("three");
                   break;
               case '4':
                   System.out.println("four");
                   break;
               case '5':
                   System.out.println("five");
                   break;
               case '6':
                   System.out.println("six");
                   break;
               case '7':
                   System.out.println("seven");
                   break;
               case '8':
                   System.out.println("eight");
                   break;
               default:
                   System.out.println("nine");
                   break;
           }

        }
    }
}
