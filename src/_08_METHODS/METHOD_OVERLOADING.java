package _08_METHODS;

public class METHOD_OVERLOADING {
    static int a(int a, int n) {
        return (a > n ? a : n);
    }

    static float b(float a, float b) {
        if (a > b)
            return a;
        else
            return b;
    }

    static int b(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > c)
            return b;
        else
            return c;
    }

    public static void main(String[] args) {
        // POLYMORPHISM IS ACHIVED WITH THE HELP OF METHOD OVERLOADING AND IT IS ACHIVED DUE TO THE CHANGE IN THE PARAMETER
        // METHOD OVERLOADING MEANS METHOD HAVING THE SAME NAME WITH DIFFERNT PARAMETER

        System.out.println(a(10, 2));
        System.out.println(b(10.4f, 2.3f));
        System.out.println(b(10, 2, 5));
        System.out.println();
    }
}
