class MyThread extends Thread {

    public void run() {

        int i=1;
        while(true) {
            System.out.println(i+ " Hello ");
            i++;
        }
    }
}

public class ThreadTest1 {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        m.start();

        int i=1;
        while(true) {
            System.out.println(i+ " World");
            i++;
        }
    }
}