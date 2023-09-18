
        package _08_METHODS;

        public class STUDENT_CHALLENGE2 {

            double rectange(double a, double b) {
                return a * b;

            }

            double circle(double radius) {
                double w = Math.PI * radius * radius;
                return w;
            }

            double trapizum(double a, double b, double h) {
                double g = 0.5 * h * (a + b);
                return g;
            }

            // REVERSE THE ELEMENT OF THE NUMBER

            int reverse(int a) {
                int b = 0;
                while (a != 0) {

                    int c = a % 10;
                    b = (b * 10) + c;
                    a = a / 10;
                }
                return b;

            }


            // reverse the array

    static   void reverse_array(int a[]) {
                int v = 0;
                int b[] = new int[a.length];
                for (int i = a.length - 1; i >= 0; i--) {

                    b[v] = a[i];
                    v++;
                }

        for (int x:b
             ) {
            System.out.println(x);
        }



            }

            public static void main(String[] args) {
                int q[] = {1,3,4,5,7,8};
reverse_array(q);
            }
        }