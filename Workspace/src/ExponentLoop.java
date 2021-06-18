import java.util.*;
import java.util.Scanner;
public class ExponentLoop 
{
    public static void main(String s[])
    {
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
    }
}
