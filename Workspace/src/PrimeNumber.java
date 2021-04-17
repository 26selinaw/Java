import java.util.Scanner;
public class PrimeNumber {  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = input.nextInt();
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                System.out.printf ("this is not a prime number");
                break;
            }
            if (i==x-1) {
                System.out.printf ("this is a prime number");
            }
        }
    }
}