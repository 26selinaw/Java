public class Test {
    public static String doSomething(String s) 
    {
        final String BLANK = " "; //BLANK contains a single space String str = ""; //empty string
        String temp;
        for (int i = 0; i < s.length(); i++)
        {
            temp = s.substring(i, i + 1); 
            if (!(temp.equals(BLANK)))
                str += temp;
                System.out.println ("hi");
        }
        return str;
    }
}