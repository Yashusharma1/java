package INHERITANCE;
class car{
    public void start(){
        System.out.println("car is started");
    }
    public void accelerate(){
        System.out.println("car is accelerated");
    }
    public void changegeara(){
        System.out.println("car gear changed");
    }
}

class luxuaryCar extends car{
    @Override
    public void changegeara() {
        System.out.println("automatic gear change");
    }
    public void opernroof()
    {
      System.out.println("sun roof is opened");
    }
    }
public class OVERRIDING_EXAMPLE {
    public static void main(String[] args) {
// reference and object of the car class
        car c = new car();
        c.accelerate();
        c.changegeara();c.start();
// reference and object of the luxuary car
luxuaryCar l = new luxuaryCar();
l.changegeara();
        l.opernroof();
// reference of the car and the object of the luxuary class
car x = new luxuaryCar();
        // in this only those method are called which are same in the
        // all the method of car will be availabe and those method of
        // of luxuary car will be availabe which are same as that of the
        // car
        // we cannot call the extra method that are present in the sub class

    x.start();
    x.changegeara();
    x.accelerate();
    }
}
