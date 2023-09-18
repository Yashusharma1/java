package _12_INTERFACEES;

interface test
{
    void meth1();
    void meth2();
}

class test2 implements test
{
    public void meth1(){
        System.out.println("meth1 of the sub class");
    }

    @Override
    public void meth2() {
        System.out.println("meth2 of the sub class");
    }
    public void meth3()
    {
        System.out.println("meth3 of the sub class");
    }
}
public class DEMONSTRATION_INTERFACE {
    public static void main(String[] args) {
        test t = new test2();
            t.meth1();
            t.meth2();
//            t.meth3() no meth3 as the reference is of the test not the test 2

    }
}
