package _08_METHODS;

public class challene {
    public static void main(String[] args) {
        int a[] = {3,4,8,-9,20,6};
        int b[] = new int[a.length];
        for (int i = 0;i<a.length;i++)
        {
            b[i] = a[i];
        }
        for (int e : b
             ) {
            System.out.println(e);
        }
        int c = 0;
        int d = 0;
        for(int n = 0;n<a.length;n++)
        {
            for (int j = 0;j<n;j++)
            {
                c = c + b[j];

            }
            for (int q = n+1 ;q<b.length; q++)
            {
                d = d + b[q];
            }
            if (c == d){
                System.out.println(a[n] + "is  equablirum");
            }else {
                System.out.println(a[n]+"not equablirum");
            }
            c = 0;
            d = 0;

        }
    }
}
