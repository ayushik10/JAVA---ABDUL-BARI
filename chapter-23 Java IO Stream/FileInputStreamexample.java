import java.io.FileReader;
//import java.io.FileInputStream;

public class FileInputStreamexample 
{
    public static void main(String[] args) throws Exception
    {
        try (FileReader fis = new FileReader("C:/Users/Ayushi/Test.txt")) 
        {
            /*byte b[] = new byte[fis.available()];
            fis.read(b);

            String str = new String(b);
            System.out.println(str);*/

            int x;

            //while((x=fis.read()) != -1)

            do
            {
                x = fis.read();

                if(x != -1)
                System.out.print((char)x);

            } while(x != -1);
        }
    }
}
