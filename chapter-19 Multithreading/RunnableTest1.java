public class RunnableTest1 implements Runnable {

    public void run() {

        int i=1;
        while(true) {
            System.out.println(i+ " Hello ");
            i++;
        }
    }

    public static void main(String[] args) {
        
        RunnableTest1 r = new RunnableTest1();
        Thread th = new Thread(r);

        th.start();

        int i=1;
        while(true) {
            System.out.println(i+ " World");
            i++;
        }
    }
}
