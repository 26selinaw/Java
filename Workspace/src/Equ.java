public class Equ {
    public static void main(String[] args) throws Exception {
        float a1 = 3;
        float b1 = -4;
        float c1 = 17;
        float a2 = 1;
        float b2 = 2;
        float c2 = 1;
        float y = ((c1*a2)-(c2*a1))/((b1*a2)-(b2*a1));
        float x = ((c1*b2)-(c2*b1))/((a1*b2)-(a2*b1));
        System.out.printf ("Equation 1: %fx+%fy=%f Equation 2: %fx+%fy=%f x = %f y = %f \n", a1, b1, c1, a2, b2, c2, x, y);

    }
}
