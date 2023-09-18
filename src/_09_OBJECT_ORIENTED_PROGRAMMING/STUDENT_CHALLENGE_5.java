package _09_OBJECT_ORIENTED_PROGRAMMING;

class customer{
    private String name;
    private String Address;
    private int phoneNo;
    private String custid;

    public customer()
    {
        name = "mihan";
        Address = "ass f";
        phoneNo = 708786233;
        custid = "asdf3455";
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return Address;
    }

    public void setAddress(String a)
    {
        Address = a;
    }

    public int getPhoneNo() {
        return phoneNo;
    }
    public String getCustid()
    {
        return custid;
    }
}
class product
 {
    private String itemno;
    private String name;
    private double price;
    private short quantity;

    public product()
    {
        itemno = "A1234WRT";
        name = "toffe";
        price = 120;
        quantity  = 1;
    }
  public product(String s, String a)
  {
      itemno = s;
      name = a;
      price = 12;
      quantity = 1;


  }
    public String getItemno()
    {
        return itemno;
    }
    public String getName()
    {
        return getName();
    }
    public double getPrice()
    {
        return price;
    }
    public short getquantity()
    {
        return quantity;
    }

public void setPrice(double a)
{
    price = a;
}
public void setquantity(short c)
{
    quantity = c;
}


}
public class STUDENT_CHALLENGE_5 {
    public static void main(String[] args) {
        // FIRST CREATE THE PRODUCT AND THE CONSUMER CLASS

    }
}
