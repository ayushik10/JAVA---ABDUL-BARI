import java.io.ByteArrayInputStream;

public class ByteDemoInputStream 
{
    public static void main(String[] args) throws Exception
    {
        byte b[] = {'a', 'b', 'c', 'd', 'e'};
        
        ByteArrayInputStream bis = new ByteArrayInputStream(b);

        /*int x;

        while((x=bis.read()) != -1) 
        {
            System.out.println((char)x);
        }*/

        String str = new String(bis.readAllBytes());

        System.out.println(bis.markSupported());
        System.out.println(str);
        
        bis.close();
    }
}