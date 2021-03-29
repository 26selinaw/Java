public class Equ {
    public static void main(String[] args) throws Exception {
        int a1 = 3;
        int b1 = -4;
        int c1 = 17;
        int a2 = 1;
        int b2 = 2;
        int c2 = 1;
        float y = ((c1*a2)-(c2*a1))/((b1*a2)-(b2*a1));
        float x = ((c1*b2)-(c2*b1))/((a1*b2)-(a2*b1));
        System.out.printf ("Equation 1: %dx+%dy=%d Equation 2: %dx+%dy=%d x = %f y = %f \n", a1, b1, c1, a2, b2, c2, x, y);

    }
}
