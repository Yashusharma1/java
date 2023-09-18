package INHERITANCE;

class Super1
{
    public void display()
    {
        System.out.println("Super class method");
    }
}

class sub1 extends Super1 {
    public void display()
    {
        System.out.println("sub class method");
    }
    public void display2()
    {
        System.out.println("sub class method display2");
    }
}

public class DYNAMIC_DISPATCH {
    public static void main(String[] args) {
// now if we create the method whose reference is of super class and the object is of sub
        Super1 s1 = new sub1();
        // now if we call the method display
        s1.display();
// the method of sub class will be called as the object of sub class is crated so alawys the method of the object are used
/*
1:WE CAN CREATE THE REFERECNE OF THE SUPER CLASS AND THE OBHECT OF THE SUB CLASS
2:BUT WE  CANNOT CREATE THE REFERENCE OF THE SUB CLASS AND THE METHOD OF THE SUPER CLASS
3: CREATE THE REFERECNE OF THE SUPER CLASS AND THE OBHECT OF THE SUB CLASS THEN THE
 METHOD OF THE SUB CLASSES ARE CALLED WHICH ARE ALSO PRESENT IN THE SUPER CLASS
 OR WE CAN SAY THOSE METHOD WHICH ARE SAME IN THE BOTH
 */
//        s1.display2(); it will show the error as there are no method exist there

        // IT IS USED TO ACHIEVE THE RUNTIME POLYMORPHISM

     /*
        DYNAMIC METHOD DISPATCH MENDS
        REFERNCE OF THE SUPER CLASS AND OBJECT OF THE SUB CLASS
        }
      */
    }
}
