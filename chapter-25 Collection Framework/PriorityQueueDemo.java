import java.util.Comparator;
import java.util.PriorityQueue;

class MyComp implements Comparator<Integer>
{
    public int compare(Integer o1, Integer o2)
    {
        if(o1<o2)  return 1;
        if(o1>o2)  return -1;
        return 0;
    }
}


public class PriorityQueueDemo 
{
    public static void main(String[] args) 
    {
        //PriorityQueue<Integer> pq = new PriorityQueue<>();
       PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComp());

        pq.add(5);
        pq.add(10);
        pq.add(1);
        pq.add(15);

        System.out.print("First element : ");
        System.out.println(pq.peek());

        pq.forEach(x->System.out.println(x));

        pq.poll();
        System.out.println("After Deletion : ");
        pq.forEach(x->System.out.println(x));

    }
}
