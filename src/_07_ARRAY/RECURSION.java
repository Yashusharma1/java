package _07_ARRAY;

public class RECURSION {

    static void run(int a){
        if (a>0){
            System.out.println(a);
            run(a-1);
        }
        }


    static void ru(int a){
        if (a>0)
            run(a-1);
            System.out.println(a);

    }



    public static void main(String[] args) {

        ru(5);
        run(5);

        // RECRUSSION IS IMPORTANT BECAUSE IT CAN STILL BE USED WHEN IT MOVES BACK
    }
}
