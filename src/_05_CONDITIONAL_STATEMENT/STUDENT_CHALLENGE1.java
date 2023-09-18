package _05_CONDITIONAL_STATEMENT;
import java.util.*;
public class STUDENT_CHALLENGE1 {
    public static void main(String[] args) {


        /*
        * FIND IF THE NUMBER IS EVEN OR ODD
        * FIND THAT THE PERSON IS YOUNGER OR NOT
        * FIND THE GRADE OF THE GIVEN MARKS
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER");
        int a = sc.nextInt();

        if(a%2==0){
            System.out.println("a is even");
        }else{
            System.out.println("a is odd");
        }

         // 2nd problem

        System.out.println("ENTER THE age");
        int b = sc.nextInt();

        if(b>14 && b<56){
            System.out.println("b is young");
        }else{
            System.out.println("b is not young");
        }

        // GRADING OF MARKS
        System.out.println("Enter The First Marks");
        Scanner src = new Scanner(System.in);
            int c = sc.nextInt();
            System.out.println("Enter the second number");
            int d = sc.nextInt();
            System.out.println("Enter the Third number");
            int e = sc.nextInt();


       float average = (float)(c+d+e)/3;

        if(average>=70){
            System.out.println("The Grades Are A");
        }else if(average>=60 && average<70){
            System.out.println("The  average is B");
        }else if(average>=50 && average<60){
            System.out.println("The  average is C");
        }else if(average>=40 && average<50){
            System.out.println("The  average is d");
        }else{
            System.out.println("The person is failed");
        }

    }
}
