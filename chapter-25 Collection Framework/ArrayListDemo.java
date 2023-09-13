import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class ArrayListDemo
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> al1 = new ArrayList<>(20);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(50, 60, 70));

        al1.add(10);
        al1.add(0, 5);
        //al1.addAll(al2);
        al1.addAll(1, al2);
        al1.add(4, 50);
        //al1.set(5,100);

        //System.out.println(al1);
        //System.out.println(al1.contains(50));
        //System.out.println(al1.equals(al2));
        //System.out.println(al1.get(3));

        //System.out.println(al1.indexOf(50));
        //System.out.println(al1.lastIndexOf(50));

        /*for(int i=0; i<al1.size(); i++) {
            System.out.println(al1.get(i));
        }*/

        /*for(var s:al1)
        System.out.println(s);*/

        /*for(Iterator<Integer> it = al1.iterator(); it.hasNext();)
        {
            java.lang.Integer x = it.next();
            System.out.println(x);
        }*/

        /*Iterator<Integer> it = al1.iterator();
        //ListIterator<Integer> it = al1.listIterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }*/

        //al1.forEach(n->System.out.println(n));
        //al1.forEach(System.out::println);
        al1.forEach(n->show(n));
    }

    static void show(int n)
    {
        if(n>50)
        System.out.println(n);
    }
}