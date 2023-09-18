package _09_OBJECT_ORIENTED_PROGRAMMING;

class student
{
    public int roolno;
    public String name;
    public String course;
    public int m1,m2,m3;

    public int total(){
        return (m1+m2+m3);
    }
    public int average(){
        return (m1+m2+m3)/3;
    }

    public String grade()
    {
        if (average()>=60)
        {
            return "A";
        }
        else
          return  "B";
    }

    public String toString()
    {
        return "name: "+name+"\n"+"course: "+course+"\n"+"roolno: "+roolno;
    }

// toString method is automaticallly called when the refernce of the object is printed
    


}
public class STUDENT_CHALLENGE_3 {
    public static void main(String[] args) {
        // class for the student
        student s = new student();
        s.m2 = 40;
        s.m1 = 80;
        s.m3 = 100;
        s.name = "ben";
        s.course = "btecg";
        s.roolno = 12344 ;

        System.out.println(s);
    }
}
