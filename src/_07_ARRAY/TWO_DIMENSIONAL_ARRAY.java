package _07_ARRAY;

public class TWO_DIMENSIONAL_ARRAY {
    public static void main(String[] args) {
  // ways for creating the 2 d array
        int a[][] = new int[4][4];
        int b[][];
        b = new int[6][6];

        int c[][] = new int[4][];
        int[] ints = new int[3];

        // 2d arrray with the different dimension
      c[0] = new int[2];
      c[1] = new int[1];

        for (int e[]:b) {
            for (int x: e
                 ) {
                System.out.println(x);
            }
        }
    }

}
