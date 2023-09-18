package _08_METHODS;

public class VARIABLE_ARGUMENT {

    static void friends( int e,String ...s)//we cannot end variable argument with the sinle argumrnt
    {
  for(String a : s){
      System.out.println(e + "." + a);
      e++;
  }
    }

    public static void main(String[] args) {
        friends(1,"yashu ","ben", "10");
        friends(1,new String[]{"yashu ","ben", "10"});// this is an ananymous srray

    }
}
