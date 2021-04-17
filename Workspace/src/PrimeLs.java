import java.util.*;
public class PrimeLs {  
    public static void main(String args[]){    
        int x=5;
        List<Integer> list=new ArrayList<Integer>();
        while (x<=200) {
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
