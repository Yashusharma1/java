package _05_CONDITIONAL_STATEMENT;

import java.util.Scanner;

public class STUDENT_CHALLENGE2 {
   public static void main(String[] args) {
        // FIND THE DAY BASED ON THE NUMBER

        Scanner sc = new Scanner(System.in);
      /*  int src = sc.nextInt();

      if (src==1){
            System.out.println("THE DAY IS SUNDAY");
        }else if (src ==2){
            System.out.println("THE DAY IS MONDAY");
        }else if (src ==3){
            System.out.println("THE DAY IS TUESDAY");
        }else if (src ==4){
            System.out.println("THE DAY IS WEDNESDAY");
        }else if (src ==5){
            System.out.println("THE DAY IS THURSDAY");
        }else if (src ==6){
            System.out.println("THE DAY IS FRIDAY");
        }else if (src ==7){
            System.out.println("THE DAY IS SATURDAY");
        }
*/
        // FIND THE TYPE AND PROTOCOL OF THE WEBSITE
  String str3 = sc.nextLine();

    int a = str3.indexOf(':');
    String str4= str3.substring(0,a);

    int b = str3.lastIndexOf(".");
    String str5 = str3.substring(b);

        if (str4.equals("https")){
        System.out.println("hyper text tranfer protocol");
    }else if (str4=="ftp"){
        System.out.println("file transfer protocol");
    }else {
        System.out.println("some other protocol");
    }

        if (str5 =="com"){
        System.out.println("commercial");
    }else if(str5=="org"){
        System.out.println("organsation");
    }else if(str5=="net"){
        System.out.println("network");
    }else{
        System.out.println("some other type");
    }

}
}