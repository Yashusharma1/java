package _03_OPERATOR_AND_EXPRESSION;
import java.util.*;

public class CUBOIDAL {
    public static void main(String[] args)
    {
        // CALCUALTING THE AREA AND VOLUME OF THE CUBOIDAL
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF THE CUBOIDAL :");
        int LENGTH = sc.nextInt();
        System.out.println("ENTER THE BREATH  OF THE CUBOIDAL :");
        int BREATH = sc.nextInt();
        System.out.println("ENTER THE HEIGHT OF THE CUBOIDAL");
        int HEIGHT = sc.nextInt();

        int totalArea = 2*(LENGTH*HEIGHT+BREATH*HEIGHT+LENGTH*BREATH);
        int volume = LENGTH*BREATH*HEIGHT;

        System.out.println("THE TOTAL AREA OF THE CUBOIDAL IS :"+ totalArea);
        System.out.println("THE VOLUME OF THE CUBOIDAL IS :"+volume);

    }

}
