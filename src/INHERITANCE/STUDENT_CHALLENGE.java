package INHERITANCE;
class account {
    private int accountno;
    private String name;
    private String address;
    private int no;
    private String dob;
   private int balance;
    public account()
    {
        name = "Mohan";
        address = "26-A";
        no = 9876543;
        dob = "11/11/1111";
    }
    public account(String name,String dob,String address)
    {
        this.name = name;
        this.dob = dob;
        this.address= address;
    }
    public int getAccountno() {
        return accountno;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }
    public int getBalance(){return balance;}

    public String getAddress() {
        return address;
    }

    public String getDob() {
        return dob;
    }

    public void setNo(int a){no = a;}
    public void setBalance(int a){balance = a;}
}
class savingAccount extends account
{
    public int deposite(int a)
    {
       return getBalance() + a;
    }
    public int Witdraw(int a){
        return getBalance() - a;
    }


}
public class STUDENT_CHALLENGE {
    public static void main(String[] args) {

    }
}
