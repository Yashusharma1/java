package _08_METHODS;

public class PRACTISING_OBJECT_PASSING {

    void changeValueOfarray(int a[],int index,int newValue){
        a[index] = newValue;//
    }

    public static void main(String[] args) {

   int a[] = {1,2,3,4,5,6};

PRACTISING_OBJECT_PASSING p= new PRACTISING_OBJECT_PASSING();
p.changeValueOfarray(a,3,7);

for(int x : a)
{
    System.out.println(x);
}

           }
}
