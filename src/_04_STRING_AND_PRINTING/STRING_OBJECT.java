package _04_STRING_AND_PRINTING;

public class STRING_OBJECT {
    public static void main(String[] args) {
        /*
        * THERE ARE THREE WAYS FOR CREATING THE STRING
        * 1: String str1 = "java";
        * IN THIS STR1 IS THE REFERENCE AND JAVA IS THE OBJECT WHICH WILL BE
        * SIMILAR TO THAT OF AN ARRAY
        **/

        String str1 = "java";
        System.out.println(str1);

        // 2ND METHOD - CONSTRUCTOR CHAR[]

        char str2[] = {'S', 'A','B'};
        System.out.println(str2);

      // 3RD METHOD - BYTE[]

        byte str3[] = {65,66,67,68};
        System.out.println(str3);

       // 4TH METHOD - string str = new String(""): HERE STR IS REFERENCE AND NEW MEANS THAT THE OBJECT IS CREATED IN THE HEAP AND 2ND STRING IS THE CONSTRUCTOR AND THE STRING WILL BE CRATED IN THE POOL AND THE HEAP

      String str4 = new String("my name  is yashu");
     System.out.println(str4);
  // IN METHOD 4 WE CAN ALSO WRITE IT AS STRING  =  NEW STRING(STR3,1,3); MEANS WE CAN GIVE STARTING INDEX AND THE ENDING INDEX
}
}
