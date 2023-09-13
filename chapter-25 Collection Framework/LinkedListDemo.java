import java.util.*;

public class LinkedListDemo 
{
    public static void main(String[] args) 
    {
        LinkedList<Integer> al1 = new LinkedList<>();
        LinkedList<Integer> al2 = new LinkedList<>(List.of(50, 60, 70));

        al1.add(10);
        al1.add(0, 5);
        //al1.addAll(al2);
        al1.addAll(1, al2);
        al1.add(4, 50);
        al1.set(5,100);

        al1.addFirst(7);
        al1.addLast(4);
        System.out.println(al1.peek());

        //al1.forEach(n->show(n));
    }

    static void show(int n)
    {
        //if(n>50)
        System.out.println(n);
    }
}
