public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) 
        {
            for (int j = 1; j <= i; j++) {
                System.out.print("+");

                System.out.println("========");

            }
            
            for (int j = 1; j <= 6 - i; j++) 
                System.out.print("*");
            System.out.println();
        }
        /*int value = 0;
        final int SENTINEL = -999; 
        while (value != SENTINEL)
        {
            //code to process value ...
            value = IO.readInt(); //read user input
        }
        
        
        /*int count = -1;
        int n = -1;
        while (count <= n) 
        {
            System.out.println(count);
             count++; 
        }
        /*int lines = 0;
        int n = 1;
        while (lines < 10) {
            int i = 0;
            while (i<n) {
                i = i + 1;
                System.out.print('*');
            }
            System.out.println("");
            n += 1;
            lines += 1;
        }

        */
    }
}