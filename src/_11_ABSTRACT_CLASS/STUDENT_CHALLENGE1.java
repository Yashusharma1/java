package _11_ABSTRACT_CLASS;

abstract class shape {
    // as the shape is not defined so it does not have any property
    abstract public int area();

    abstract public int perimeter();
}
class circle extends shape
{
    public int radius;
    public int area()
    {
        return (int)Math.PI*radius*radius;
    }
    public int perimeter()
    {
        return 2*(int)Math.PI*radius;
    }
}
class rectangle extends shape
{
    public int length;
    public int breadth;

    @Override
    public int area() {
        return length*breadth;
    }

    @Override
    public int perimeter() {
        return 2*(length+breadth);
    }
}

public class STUDENT_CHALLENGE1
{
    public static void main(String[] args)
    {
 rectangle r = new rectangle();
 r.length = 12;
 r.breadth =12;
        System.out.println(r.area());
        System.out.println(r.perimeter());
        shape s = r;
        // in this we used the refrence of the rectangle to the referce of the shape
        // and through this we can use the method
        System.out.println(s.area());

    }
}
