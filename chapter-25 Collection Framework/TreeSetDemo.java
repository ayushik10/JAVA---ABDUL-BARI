import java.util.*;

public class TreeSetDemo
{
    public static void main(String args[])
    {
        TreeSet<Integer> t = new TreeSet<>(List.of(10,30,50,10,40,20));

        t.add(15);
    
        System.out.println(t);

        System.out.println(t.ceiling(45));
    }
}
