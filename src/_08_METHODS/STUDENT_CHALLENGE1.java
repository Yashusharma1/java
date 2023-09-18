package _08_METHODS;

public class STUDENT_CHALLENGE1 {

    // FIND THE PRIME NUMBER
    boolean prime(int a){
        for (int i = 2;i<a/2;i++)
        {
            if (i / 2 == 0)
            {
                return true;
            }

        }
        return false;

    }

    // FIND THE GCD OF THE TWO NUMBER

    int gcd(int a ,int b){
        while(a!=b)
        {
            if(a>b)
            {
                a = a-b;
            }else
            {
                b =b -a;
            }
        }

        return a;
    }

    // FIND THE MAX ELEMENT OF THE ARRAY

    int max_element(int a[]){
        int b = a[0];
        for (int i= 0;i<a.length;i++){
            if (a[i]>b){
                b=a[i];
            }
        }
        return b;
    }

    public static void main(String[] args) {

        STUDENT_CHALLENGE1 SC = new STUDENT_CHALLENGE1();
        int c = SC.gcd(10,5);
        System.out.println("THE GCD OF THE TWO NUMBER IS :"+c);

        SC.prime(12);

        int x[] = {1,2,3,5,6,7,8};
        int s =  SC.max_element(x);
        System.out.println("THE MAX ELEMENT OF THE ARRAY IS:"+ s);
    }
}
