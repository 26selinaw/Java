import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class EquList {
    public static void main(String[] args) throws Exception {
        List<Double> pointlist = new ArrayList<>(Arrays.asList(
            70.28, -22.376, 67.68, -23.765,
            60.83, -22.028, 75.97, -22.532,
            66.677, -14.69 ,66.718, -13.46
        ));

        // while loop
        int i = 0;
        while (i < pointlist.size()) {
            i++;
            double x1 = pointlist.get(i-1);
            i++;
            double y1 = pointlist.get(i-1);

            i++;
            double x2 = pointlist.get(i-1);
            i++;
            double y2 = pointlist.get(i-1);

            double m = (y1-y2)/(x1-x2);
            double b = (x1*y2-y1*x2)/(x1-x2);
            System.out.printf("point 1:(%f,%f) point 2:(%f,%f) Equation: y = %fx + %f \n", x1, y1, x2 ,y2, m, b);
        }
    }
}
