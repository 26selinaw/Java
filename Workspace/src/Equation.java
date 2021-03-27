public class Equation {
    public static void main(String[] args) throws Exception {
        int x1 = 1;
        int x2 = 3;
        int y1 = 2;
        int y2 = 4;
        int m = (y1-y2)/(x1-x2);
        int b = (x1*y2-y1*x2)/(x1-x2);
        System.out.printf("point 1:(%d,%d) point 2:(%d,%d) Equation: y = %dx + %d \n", x1, y1, x2 ,y2, m, b);
    }
}
