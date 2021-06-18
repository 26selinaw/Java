import java.util.*;
import java.util.Scanner;
public class Exponent
{
    public static void main(String s[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Base Number: ");
        int b = input.nextInt();
        System.out.print("Enter Exponent : ");
        int e = input.nextInt();
        double n = Math.pow(b, e);
        System.out.print (n);
    }
}