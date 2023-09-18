package _04_STRING_AND_PRINTING;

public class STRING_METHOD_2 {
    public static void main(String[] args) {
        /*
        * THE MORE METHOD OF THE STRING ARE
        * BOOLEAN equals();
        * BOOLREAN equalsIgnoreCase():
        * int compareTo();
        * String valueOf();  THIS CHANGES THE VALUE OF ANY TYPE INTO THE STRING FORMAT
        *  THE DIFFERENCE BETWEEN THE (equals) AND (==) IS THAT equals IS USED TO
        * COMPARE THE LITERALS OR WE CAN SAY THE ORIGINAL DATA WHILE == IS USED TO
        * COMPARE THE REFERENCE SO THATS WHY STR AND STR2 WILL NOT BE EQUALS AS ONE
        * POINTS TO THE POOL AND STR2 POINTS TO THE HEAP
        * */
        String str = "The World will Fall";
        String str1 = "The World Will Fall";
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));

        String str2 = new String("The World Will Fall");
        System.out.println(str==str2);

        System.out.println(str.compareTo(str1));
        // IT WILL GIVE THE INTEGER VALUE AS -1 WHEN STR IS SMALLER THAN STR1
        // AND 0 WHEN BOTH ARE EQUALS AND 1 WHEN STR IS GREATER THAN STRS AND IN EQUALS IT COMPARE THEIR VALUE OF ASCIA CODE

        String str3 = String.valueOf(12244);
        System.out.println(str3);

        // CONATAINS HELPS US TO FIND IF THE STRING IS PRESENT IN THE STRING OR NOT
       // CONCAT HELP TO JOIN THE TWO STRING

        System.out.println(str.concat(str1));
        System.out.println(str.contains("will"));
    }
}
