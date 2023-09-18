package _09_OBJECT_ORIENTED_PROGRAMMING;

class rectangle1
{
    private int length;
    private int breadth;

    // we cannot set the private data from the main method therefore we use get and the set method

    public int getLength()
    {
        return length;
    }
    public void setLength(int l)
    {
     length = l;
    }

    public int getbreadth()
    {
        return breadth;
    }
    public void setbreadth(int k)
    {
        breadth = k;
    }

    public int area()
    {
        return  length*breadth;
    }

}


public class DATA_HIDING {
    public static void main(String[] args) {

            /*
DATA HIDING IS THE PROCEESS IN WHICH WE HIDE THE DATA BY SETTING IT TO THE PRIVATE
WE CAN UNDERSTAND IT WITH THE HELP OF AN EXAMPLE
AS IN THE CAR THE ENGINE IS HIDDEN AND THE STARTING AND THE BREAK ARE GIVEN
IT IS SO THAT THE DATA SHOULD ALWAYS REMAIN HIDDEN AND AND OPERATION ARE DONE BY THE
METHOD SO IT IS ALWAYS HELPFUL TO MAKE THE DATA PRIVATE
 */

        rectangle1 r = new rectangle1();
        r.setLength(12);
        r.setbreadth(12);
        System.out.println(r.area());

    }

}
