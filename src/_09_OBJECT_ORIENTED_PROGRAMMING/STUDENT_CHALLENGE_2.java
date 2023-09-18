package _09_OBJECT_ORIENTED_PROGRAMMING;


class cylinder{
    public double radius;
    public double height;

    public double lidarea()
    {
        return Math.PI*radius*radius;
    }
    public double circumfrence()
    {
        return  (2 * Math.PI * radius);

    }
        public double volume()
        {
            return lidarea()*height;
        }

        public double totalsurfacearea()
        {
            return lidarea()*circumfrence()*2*radius;
        }
}


public class STUDENT_CHALLENGE_2 {
    public static void main(String[] args) {
        // CLASS OF THE CYLINDER
        cylinder c = new cylinder();
        c.height = 23;
        c.radius = 4;
        System.out.printf("%4.2f",c.lidarea());
    }
}
