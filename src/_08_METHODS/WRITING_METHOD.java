package _08_METHODS;

public class WRITING_METHOD {

    int max(int a,int b){
        // IN THIS A AND B ARE THE FORMAL PARAMETER
        if (a>b){
            return a;
        }else
        {
            return b;
        }
    }


    public static void main(String[] args)
    {
        WRITING_METHOD m = new WRITING_METHOD();
        int c  = m.max(10,20); // AND 10 AND 20 ARE THE ACTUAL PARAMETER
        // AND THIS PERAMETER DOES NOT CHANGE
        System.out.println(c);
    }
}
