import java.util.*;
import java.util.Scanner;
public class PrimeLs {  
    public static void main(String args[]){    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the minimum: ");
        int x = input.nextInt();   
        System.out.print("Enter the maximum: ");
        int y = input.nextInt();   
        List<Integer> list=new ArrayList<Integer>();
        while (x<=y) {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    break;
                }
                if (i==x-1) {
                    list.add (x);
                }
            }
            x++;
        }
        for (Integer primenumber:list) {
            System.out.printf("%d\n",primenumber);
        }  
    }  
}
