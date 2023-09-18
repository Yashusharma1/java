package INHERITANCE;

class rectangle1{
    public int length;
    public int breadth ;
    public int x = 10;
    public rectangle1()// when there are no parameter
    {
        length =1;
        breadth=1;

    }
    public rectangle1(int length,int breadth)
    {
        this.length = length;
        /*
        WHEN THE PARAMETER HAS THE SAME NAME
        AS THAT OF THE VARIABLE WE CAN USE THE THIS KEYBOARD AS IT IS USED
        TO POINT TO THE SAME OBJECT WHICH IS THE RECTANGLE1

         */
        this.breadth = breadth;
    }

}

class cubloidal1 extends rectangle1 {
    public int height;
         public int x = 20;
    public cubloidal1()
    {
        height = 1;
    }
    public cubloidal1(int a)
    {
        height = a;
    }
    public cubloidal1(int a,int b, int c)
    {
        super(a,b);
        height = c;
    }
    public int volume()
    {
        return length*breadth*height;
    }

    public void toDisplay()
    {
        System.out.println(this.x); // print x = 20 as it refercne to the cuboidal class
        System.out.println(super.x);// print x = 10 as it will point towrd the parent clss
    }

}
public class THIS_VS_SUPER {
    public static void main(String[] args) {
        cubloidal1 c = new cubloidal1(12,13,14);
c.toDisplay();

    }
}
