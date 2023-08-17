class Thread2 extends Thread {
    public void run() {
        int i=1;
        while(true) {
            System.out.println(i++ +"Thread2");
        }
    }
} 

public class ThreadClassMethods2 {
    public static void main(String args[]) throws Exception {
        Thread2 t = new Thread2();
       // t.setDaemon(true);
        t.start();

       // try { Thread.sleep(100);} 
       // catch(Exception e) {}

      // Thread mainThread = Thread.currentThread();
      // mainThread.join();

      int i=1;
        while(true) {
            System.out.println(i++ +"Main");
            //Thread.yield();
        }
    }
}
