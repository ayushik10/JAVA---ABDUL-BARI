class RunnableTest implements Runnable {

    public void run() {

        int i=1;
        while(true) {
            System.out.println(i+ " Hello ");
            i++;
        }
    }
}

public class RunnableTest2 {
    
    public static void main(String[] args) {
        
        RunnableTest r = new RunnableTest();
        Thread th = new Thread(r);

        th.start();

        int i=1;
        while(true) {
            System.out.println(i+ " World");
            i++;
        }
    }
}
