import java.io.ByteArrayOutputStream;

public class ByteDemoOutputStream 
{
    public static void main(String[] args) throws Exception
    {
        ByteArrayOutputStream bos = new ByteArrayOutputStream(10);

        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        bos.write('e');

        byte b[] = bos.toByteArray();

        for(byte x:b)
        System.out.println((char)x);

        bos.close();
    }
}
