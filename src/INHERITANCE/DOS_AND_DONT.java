package INHERITANCE;
class a{}
class b extends a{}
class sup{
    public a displaly()
    {
        System.out.println("sup method");
        return new a();
    }
}
class su extends sup{   // this is accepted as the return type is object a and other have return type as the b which is accepteted as a is super class and b is sub clas
    public  b displaly()
    {
        System.out.println("su dis");
        return new b();
    }
}
public class DOS_AND_DONT {
    public static void main(String[] args) {
        /*
        public
        protected
        private

        if the super class is private then the overrdied method can be public protected and private
        the method cannot be static and the final

         */

        // another exeception si
    }
}
