package _09_OBJECT_ORIENTED_PROGRAMMING;


class circle
{
    public int radius;

    public int area()
    {
        return (int) (Math.PI*radius*radius);
    }
    public int perimeter()
    {
        return (int)( 2*Math.PI*radius);
    }
}
public class CIRCLE_CLASS {
    public static void main(String[] args) {
        circle c = new circle();
        c.radius = 4;
        System.out.println(c.area());
        System.out.println(c.perimeter());

    }
}