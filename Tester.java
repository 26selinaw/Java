public class Tester 
{
    public void someMethod(int a, int b) 
    {
        int temp = a; 
        a = b;
        b = temp;
    }
}
public class TesterMain 
{
    public static void main(String[] args) 
    {
        int x = 6, y = 8;
        Tester tester = new Tester(); 
        tester.someMethod(x, y);
    } 
}

