package _04_STRING_AND_PRINTING;

public class STRING_METHOD {
    public static void main(String[] args) {
        // int length() THIS METHOD WILL GIVE THE LENGTH OF THE STRING
        String str = "welcome";
        int a = str.length();
        System.out.println(a);

        // String toLowerCase(); THIS METHOD WILL PRINT THE STRING IN THE LOWERCASE AND THE NEW STRING WILL BE CREATED IN THE HEAP AS THE STRING ARE IMMUTABLE
        String str1 = str.toLowerCase();
        System.out.println(str1);

        // string toUpperCase(); IT WILL PRINT THE LETTER IN THE UPPERCASE AND THIS ALSO CREATED IN THE HEAP AS THE STRING ARE IMMUTABLE
        String str2 = str.toUpperCase();

        // String trim(); THIS METHOD WILL REMOVE THE SPACES FROM THE FRONT AND THE LAST SIDE OF THE STRING
        String str3 = "    welcome   ";
        System.out.println(str3.trim());
        // String substring(int begin ); // THIS METHOD WILL PRINT THE WORD FROM THE STARTING INDEX TO THE LAST INDEX

        String str4 = str.substring(2);
        System.out.println(str4);

        // String substring(int begin , int ending )
          String str5 = str.substring(2,4);
        // String replace('a','b') THIS METHOD WILL REPLACE THE CHARCTER A WITH THE CHARCTER B//

}
}