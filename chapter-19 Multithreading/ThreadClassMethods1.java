/* class MyRun implements Runnable {
    public void run() {}
} */

class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
        //setPriority(Thread.MIN_PRIORITY+3);
    }

    public void run() {
        int i = 1;
        while(true) {
            System.out.println(i++);

            try {
                Thread.sleep(100);
            }
            catch(InterruptedException e) {
                System.out.println(e);
            }
            
        }
    }
}

public class ThreadClassMethods1 {
    public static void main(String args[]) {

        //Thread t = new Thread("My Name"); 
        MyThread m = new MyThread("My Thread");
        
        //System.out.println("ID : " +m.getId());
        //System.out.println("Name : " +m.getName());
        //System.out.println("Priority : " +m.getPriority());

        m.start();
        m.interrupt();

        //System.out.println("State : " +m.getState());
       // System.out.println("Alive : " +m.isAlive());

    }
}
