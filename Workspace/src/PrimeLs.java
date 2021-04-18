import java.util.*;
import java.util.Scanner;
public class PrimeLs {  
    public static void main(String args[]){    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the minimum: ");
        long x = input.nextLong();
        System.out.print("Enter the maximum: ");
        long y = input.nextLong();
        List<Long> list=new ArrayList<Long>();
        while (x<=y) {
            for (long i = 2; i < x; i++) {
                if (x % i == 0) {
                    break;
                }
                if (i==x-1) {
                    list.add (x);
                }
            }
            x++;
        }
        for (Long primenumber:list) {
            System.out.printf("%d\n",primenumber);
        }  
        System.out.printf("The length of the list is %d", list.size());
    }  
}
