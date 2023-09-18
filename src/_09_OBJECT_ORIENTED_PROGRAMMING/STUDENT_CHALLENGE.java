package _09_OBJECT_ORIENTED_PROGRAMMING;

class rectangle{
    public int length;
    public int breadth;

    public int area()
    {
        return length*breadth;
    }
    public int perimeter()
    {
        return 2*(length+breadth);
    }
    public boolean issquare()
    {
        return length==breadth;
    }


}

public class STUDENT_CHALLENGE {
    public static void main(String[] args) {
        // CREATE THE CLASS FOR THE RECTANGLE
        rectangle r = new rectangle();
        r.length = 4;
        r.breadth  = 4;
        System.out.println(r.area());
        System.out.println(r.perimeter());
        System.out.println(r.issquare());

    }
}
