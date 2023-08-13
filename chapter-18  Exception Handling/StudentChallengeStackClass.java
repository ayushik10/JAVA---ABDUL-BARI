class StackOverflow extends Exception
{
    public String toString()
    {
        return "Stack is Full";
    }
}

class StackUnderflow extends Exception
{
    public String toString()
    {
        return "Stack is Empty";
    }
}

class Stack 
{
    private int size;
    private int top = -1;
    private int A[];

    public Stack(int s) 
    {
        size = s;
        A = new int[s];
    }

    public void push(int x) throws StackOverflow
    {
        if(top == size-1)
        throw new StackOverflow();

        top++;
        A[top] = x;
    }

    public int pop() throws StackUnderflow
    {
        int x = -1;

        if(top == -1)
        throw new StackUnderflow();

        x = A[top];
        top--;
        return x;
    }
}

public class StudentChallengeStackClass 
{
    public static void main(String args[]) 
    {
        Stack S = new Stack(4);

        try
        {
            //S.push(15);
            //S.push(10);
            //S.push(5);
            //S.push(20);
            //S.push(25);
            S.pop();
        }

        /*catch(StackOverflow o)
        {
            System.out.println(o);
        }*/

        catch(StackUnderflow o)
        {
            System.out.println(o);
        }
    }
}