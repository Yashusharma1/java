package _07_ARRAY;

public class ONE_DIMENSIONAL {
    public static void main(String[] args) {
        // THERE ARE THREE WAYS TO CREATE AN ARRAY

        int a[]= new int[4];
        int b[] = {1,2,3,4,5};
        int [] c;
        c = new int[4];

        for (int i = 0;i<=b.length-1;i++)
        {
            System.out.println(b[i]);
        }
        for (int x:b)
        {
            System.out.println(x++);
        }
    }
}
