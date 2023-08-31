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
        
        String string1 = "I am a string";
        String string2 = string1;
        String string3 = "I am also a string";
        boolean stringsEqual = (string1 == string3);
        
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(stringsEqual);
    }
}