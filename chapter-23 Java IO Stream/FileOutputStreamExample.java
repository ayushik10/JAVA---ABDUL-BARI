import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample
{
    public static void main(String args[])throws Exception
    {
        //try
        //{
           try( FileOutputStream fos = new FileOutputStream("C:/Users/Ayushi/Test.txt")) 
           {
            String str = "Learn JAVA Programming";

            byte b[] = str.getBytes();
            fos.write(b);

            /*for(byte x:b)
            fos.write(x);*/

            //fos.write(b, 6, str.length()-6);

            //fos.write(str.getBytes());
            
            //fos.close();
        }

        /*catch(FileNotFoundException e)
        {
            System.out.println(e);
        }

        catch(IOException e)
        {
            System.out.println(e);
        }*/

    }
}