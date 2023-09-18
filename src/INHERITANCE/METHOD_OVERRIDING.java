package INHERITANCE;

class Super
{
    public void display()
    {
        System.out.println("Super class method");
    }
}

class sub extends Super {
    public void display()
    {
        System.out.println("sub class method");
    }
}

public class METHOD_OVERRIDING {
    public static void main(String[] args)
    {
        Super Sup = new Super();
        Sup.display(); // in this the method of the super class will be displalyed

        sub s = new sub();
        s.display();  // in this as both the super and the sub class has the same method name then the method of the super class will be overrided and the method of he sub class will be used
       Super s1 = new sub();
    }
}
