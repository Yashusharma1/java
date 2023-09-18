package INHERITANCE;

import javax.swing.text.html.HTMLDocument;

class rectangle{
    public int length;
    public int breadth ;

    public rectangle()// when there are no parameter
    {
        length =1;
        breadth=1;
    }
    public rectangle(int a,int b)
    {
        length = a;
        breadth = b;
    }
    public int area()
    {
        return length*breadth;
    }
}

class cubloidal extends rectangle {
    public int height;

    public cubloidal()
    {
        height = 1;
    }
    public cubloidal(int a)
    {
        height = a;
    }
    public cubloidal(int a,int b, int c)
    {
        super(a,b);
        height = c;
    }
    public int volume()
    {
        return area()*height;
    }
}
public class PARAMETER_CONTRUCTOR {
    public static void main(String[] args) {
        // IN THIS WE WILL LEARN HOW THE
        // PARAMETER IN THE CHILD CLASS CAN BE PASSED SO THAT IT CAN BE USED
        // IN THE SUPER CLASS
//        cubloidal c = new cubloidal();
        // if no parameter is passed then the volume will be 1 as the constructor of zero parameter is called which is 1,1
        cubloidal c = new cubloidal(3,4,5);
        System.out.println(c.volume());

    }
}
