import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo 
{
    public static void main(String[] args) 
    {
        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(1,"A");
        ht.put(2,"B");
        ht.put(3,"C");
        ht.put(4,"D");

        /*String s = (String)ht.get(3);

        Enumeration e = ht.keys();
        //Enumeration e = ht.elements();

        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }*/

        ht.compute(2, (k,v)->v+"X");
        ht.computeIfAbsent(5, (k)-> "Z"+k);

        System.out.println(ht);
    }
}
