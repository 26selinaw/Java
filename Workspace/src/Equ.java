public class Equ {
    public static void main(String[] args) throws Exception {
        float a1 = 99681257;
        float b1 = 5833498;
        long c1 = 88888254389L;
        long a2 = 83457908423L;
        long b2 = 123894289121822L;
        long c2 = 12389246580234L;
        float y = ((c1*a2)-(c2*a1))/((b1*a2)-(b2*a1));
        float x = ((c1*b2)-(c2*b1))/((a1*b2)-(a2*b1));
        System.out.printf ("Equation 1: %fx+%fy=%d Equation 2: %dx+%dy=%d x = %f y = %f \n", a1, b1, c1, a2, b2, c2, x, y);

    }
}
