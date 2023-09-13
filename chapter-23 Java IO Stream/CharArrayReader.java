import java.io.*;

public class CharArrayReader 
{
    public static void main(String[] args) throws Exception
    {
        char c[] = {'a', 'b', 'c','d'};

        CharArrayReader ch = new CharArrayReader(c);
        int x;

        while((x=ch.read()) != -1)
        {
            System.out.println((char)x);
        }

        ch.close();
    }    
}
