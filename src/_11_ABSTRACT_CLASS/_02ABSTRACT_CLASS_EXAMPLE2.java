package _11_ABSTRACT_CLASS;

abstract class hospitalRules
{
    public hospitalRules() {System.out.println("hospital rules");}
    abstract public void emergency();
    abstract public void billing();
    abstract public void appoitment();
    abstract public void  admit();
}

class myHospital extends hospitalRules
{
    @Override
    public void admit() {
        System.out.println("the person can be addmitted");
    }

    @Override
    public void emergency() {
        System.out.println("the person can be given emergency treatment");
    }

    @Override
    public void appoitment() {
        System.out.println("the person can get the appoitment");
    }

    @Override
    public void billing() {
        System.out.println("the billing can be accepted using the card or by the cash");
    }
}
public class _02ABSTRACT_CLASS_EXAMPLE2
{
    public static void main(String[] args)
    {
        /*
        NOW THINK THAT THE PERSON WANT TO OPEN THE HOSPITAL THEN BEFORE OPENING
        HE HAS TO FOLLOW SOME OF THE RULES
        SO AFTER DEFINING ALL THE RULES HE CAN THEN OPEN THE HOSPITAL
        BUT IF ANY ONE OF THE RULES ARE NOT DEFINED THEN THE HOSPITAL
        CANNOT BE OPEN SO MY HOSPITAL IS THE OBECT
        AND THE ABSTRACT CLASS CANNOT HAVE THE OBJECT AS THE PERSON
        WHO CREATED THE RULES DOSENT MEAN THAT HE ALSO HAVE THE HOSPITAL
        HE JUST HAVE GIVEN THE RULES WHICH HAVE TO BE OPENED WHICH AS FOLLOWS

         */
        hospitalRules h = new myHospital();
        h.admit();
        h.emergency();
        h.billing();
        h.appoitment();
    }
}
