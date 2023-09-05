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
}