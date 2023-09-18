package INHERITANCE;

class parent{
    public parent()
    {
        System.out.println("parent constructor:");
    }


}
class child extends parent{
    public child(){
        System.out.println("child constructor");
    }

}
class grandchild extends child {
    public grandchild()
    {
        System.out.println("grandchild constructor");
    }
}
public class CONSTRUCTOR_IN_INHERITANCE {
    public static void main(String[] args) {
        grandchild g = new grandchild();
      /* IN THIS THE FIRST PARENT CONSTRUCTOR IS CALLED THEN TEH CHILD AND THEN THE GRAND CHILD
      SO WE CAN SAY WHEN THE CHILD CONSTRUCTOR IS CALLED THE PARENT CONSTRUCTOR IS CALLED FIRST
       */
    }
}
