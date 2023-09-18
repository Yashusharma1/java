package _09_OBJECT_ORIENTED_PROGRAMMING;

class cylinder1{
    private int radius;
    private int height;

    public cylinder1()
    {
        radius = 1;
        height = 1;

    }
    public cylinder1(int a, int b)
    {
        setRadius(a);
        setHeight(b);
    }
    public void setRadius(int c )
    {
        if (c<0)
            radius = 0;
        else
            radius = c;
    }

    public void setHeight(int c )
    {
        if (c<0)
            radius = 0;
        else
            radius = c;
    }
}
public class STUDENT_CHALLENGE_4  {
    public static void main(String[] args) {

    }
}
