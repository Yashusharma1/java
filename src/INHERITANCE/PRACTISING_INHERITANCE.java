package INHERITANCE;

class circle{
    public double radius;

    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
}

class cylinder extends circle
{
    public int height;

    public double volume()
    {
        return area()*height;
    }
}
public class PRACTISING_INHERITANCE {

    public static void main(String[] args) {

circle c = new circle();
cylinder y = new cylinder();

y.radius =2;
y.height = 4;

        System.out.println(y.area());
        System.out.println(y.perimeter());
        System.out.println(y.volume());
    }
}
