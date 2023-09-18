package _04_STRING_AND_PRINTING;

public class STRING_METHOD_1 {
    public static void main(String[] args) {
        // MORE METHOD OF THE STRING
        String str = "My name is Yashu";
        // boolean startsWith("");
        System.out.println(str.startsWith("My"));
        // boolean endsWith("");
        System.out.println(str.endsWith("Yashu"));

        // int indexOf(""):
        System.out.println(str.indexOf("yashu"));

        // char charAt(int);
        System.out.println(str.charAt(10));

        // int lastIndexOf("");
        System.out.println(str.lastIndexOf('a',10));

    }
}
