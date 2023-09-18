package _09_OBJECT_ORIENTED_PROGRAMMING;


class rectangle2{
    private int length;
    private int breadth;

    public rectangle2()
    {
        length = 1;   // WHEN NO PARAMETER IS PASSED
        breadth = 1;

    }

    public rectangle2(int a, int b)
    {

        setlength(a);  // WHEN PARAMENTER IS PASED
        setBreadth(b); // NOW BY SOME REASON THE NEGATIVE VALUE ARE PASED THEN IT WILL ACCEPT THE VALUE SO WE USE setlegth method
        //  WE CANNOT USE THE IF AND ELSE STATEMENT IN THE CONSTRUCTOR
    }

    public void setlength(int l)
    {
        if (l<0)
            length = 0;
        else
            length = l;
    }

    public void setBreadth(int s)
    {
        if (s<0)
            length = 0;
        else
            length = s;
    }
    public int area()
    {
        return length*breadth;
    }
}
public class CONSTRUCTOR {

    public static void main(String[] args){

        /* A CONSTRUCTOR IS AUTOMATICALLY CALLED WHEN THE REFERENCE OF THE OBJECT IS CREATED
ALL THE CONSTRUCTOR HAS ONE DEFAULT CONSTRUCTOR AND IT IS AUTOMATICALLY CALLED WHEN THEIR
ARE NO PARAMETER IS PASSED
CONSTRUCTOR DOES NOT HAVE THE RETURN TYPES
SYNTAX : public class_name(){
lenght =1;
breadth = 1;
 */

        rectangle2 r = new rectangle2(12,12);
        System.out.println(r.area());
    }


}
