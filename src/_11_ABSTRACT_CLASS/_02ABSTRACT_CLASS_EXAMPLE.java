package _11_ABSTRACT_CLASS;

abstract class ben
{
    public ben()
    {
        System.out.println("ben constructor");
    }
    public void display()
    {
        System.out.println("display");
    }
  abstract  public void display2();
}
class bn extends ben
{
    public void display2()
    {
        System.out.println("drive is now defined");
    }
}

public class _02ABSTRACT_CLASS_EXAMPLE
{
    public static void main(String[] args)
    {
         ben b = new bn();// the constructor is always called if it is created
         b.display();
         b.display2();
    }
}
