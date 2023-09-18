package _05_CONDITIONAL_STATEMENT;

import java.util.Scanner;

public class STUDENT_CHALLENGE3 {
    public static void main(String[] args) {
     // NAME OF THE DAY BASED ON THE NUMBER
/*
        Scanner src = new Scanner(System.in);
        System.out.println("enter the day for the week");
        int a = src.nextInt();

        switch(a){
            case 1 : System.out.println("MONDAY");
                break;
            case 2 : System.out.println("TUESDAY");
                break;
            case 3 : System.out.println("WEDNESDAY");
                break;
            case 4 : System.out.println("THRUSDAY");
                break;
            case 5 : System.out.println("FRIDAY");
                break;
            case 6 : System.out.println("SATURDAY");
                break;
            case 7 : System.out.println("SUNDAY");
                break;
             default : System.out.println("INVALID");
                break;
        }

        // FIND THE MONTH BASED ON THE NUMBER

        Scanner b = new Scanner(System.in);
        System.out.println("enter the day for the year");

        int c = b.nextInt();
        switch (c){
            case 1 : System.out.println("JANUARY");
                break;
            case 2 : System.out.println("FEBRUARY");
                break;
            case 3 : System.out.println("MARCH");
                break;
            case 4 : System.out.println("APRIL");
                break;
            case 5 : System.out.println("MAY");
                break;
            case 6 : System.out.println("JUNE");
                break;
            case 7 : System.out.println("JULY");
                break;
            case 8 : System.out.println("AUGUST");
                break;
            case 9 : System.out.println("SEPTEMBER");
                break;
            case 10 : System.out.println("OCTOBER");
                break;
            case 11 : System.out.println("NOVEMBER");
                break;
            case 12 : System.out.println("DECEMBER");
                break;
            default :  System.out.println("INVALID DAY");
                break;
*/
        // FIND THE TYPE OF THE WEBSITE

        Scanner d = new Scanner(System.in);
        String e = d.nextLine();

        String f = e.substring(e.lastIndexOf("."));

        switch(f) {
            case ".com":
                System.out.println("commercial");
                break;
            case ".gov":
                System.out.println("goverment");
                break;
            case ".net":
                System.out.println("network");
                break;
            default:
                System.out.println("other than the three");
                break;
        }



        }
    }

