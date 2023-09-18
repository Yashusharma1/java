package _09_OBJECT_ORIENTED_PROGRAMMING;
class subject{
    private int marksObtained;
    private int maxamarks;
    private String name;
    private String subid;

    public subject(String a,int b) {

  name= a;
   setMarksObtained(b);
    }
    public int getMaxamarks() {return maxamarks;}
    public int getMarksObtained() {return marksObtained;}
    public String getName() {return name;}
    public String getSubid() {return subid;}

    public void setMarksObtained(int l) {marksObtained = l;}
    public void setMaxamarks(int l) {maxamarks = l;}
    public boolean isqualified() {return (maxamarks/marksObtained)>40;}
}
public class STUDENT_CHALLENGE_6
{
    public static void main(String[] args)
    {
// ARRAY OF THE OBJECT
        subject sub[] = new subject[3];
        // here sub is the reference which is pointing towards the sub of size 3
        sub[0]= new subject("yashu",1
        );
        sub[1]= new subject("ten",13);
        sub[2]= new subject("aaaa",13);
    }
}
