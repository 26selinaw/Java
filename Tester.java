public class TempTest
{   
    public static void main(String[] args) 
    {
    System.out.println("Enter temperature scale: ");
    String tempScale = IO.readString(); 
    //read user input System.out.println("Enter number of degrees: ");
    double tempDegrees = IO.readDouble(); 
    //read user input 
    /* code to construct a valid temperature from user input */
    } 
}
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

