import java.util.*;
import java.util.Scanner;
public class ExponentLoop 
{
    public static void caculateExponent() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Base Number: ");
        int b = input.nextInt();
        System.out.print("Enter Exponent : ");
        int e = input.nextInt();
        long n = 1;

        for (int i = 0; i < e; i++) 
        {
            n *= b;
        }          
        System.out.printf("Result is %d\n", n);

        input.close();
    }

    public static void printArray() {
        /*
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 7;
        array[3] = 8;
        array[4] = 9;
        */
        int[] array = new int[] {1, 2, 7, 8, 9};

        int length = array.length;
        for (int i = 0; i < length; i++) {
            System.out.printf("array[%d]: %d\n", i, array[i]);
        }

        System.out.printf("2-D array\n");

        int[][] tD = new int[][] {
            {1, 2, 0},
            {7, 8, 6},
            {2, 18, 9},
        };

        int rows = tD.length;
        int cols = tD[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // System.out.printf("array[%d][%d]: %d ", i, j, tD[i][j]);
                System.out.printf("%2d ", tD[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String s[]) {
        printArray();

        // caculateExponent();
    }
}