public class HelloWorld
{
    public static void main(String[] args)
    {
        int i = 10;
        double f = 2.5;
        boolean flag = true;
    
        f += i;
        flag = !flag;
        i += 1;
        
        System.out.println(i);
        System.out.println(f);
        System.out.println(flag);
    }
    public static void mainstring (String[] args){
        String string1 = "I am a string";
        String string2 = string1;
        String string3 = "I am also a string";
        int stringsEqual = (string1.compareTo(string3));
        
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(stringsEqual);
    }
    public static void mainarray (String[] args){
        String[] arraystring = {"Alpha", "Bravo", "Charlie", "Delta", "Echo"};
        for (int i = 0; i < arraystring.length; i++) {
            System.out.println(arraystring[i]);
        }
        System.out.println("");
        for (String value : arraystring) {
            System.out.print(value);
        }
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < arraystring.length; i++) {
            System.out.print(arraystring[i]);
            if (i != arraystring.length-1) {
                System.out.print("-");
            }
        }
    }    
    
    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
        System.out.println("Hello World!");
        
        if (a == 5) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAILURE");      
        }
        if (b == 2) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAILURE");      
        }
        if (c != 1) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAILURE");      
        }
        if ( (d == -8) && (a == 4) ) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAILURE");      
        }
    }

    public static void mainifstates (String[] argss) {
        HelloWorld hw = new HelloWorld();
        hw.run();

    }
    
    public void runWhile() {
        int i = 0;
        int k = 10;
        
        while (i < 15) {
            i++;
            System.out.println("i is " + i + " but is less than 15");
        }
        while (k > 5) {
            k--;
            System.out.println("k is " + k + " but is greater than 5");
        }
        while ( (a < 10) && (b <= 20) ) {
            a++;
            b++;
            System.out.println(b);
            System.out.println(a);
        }
    }
    
    public static void mainwhileloops (String[] args) {
        HelloWorld hw = new HelloWorld();
        hw.runWhile();
    }
}