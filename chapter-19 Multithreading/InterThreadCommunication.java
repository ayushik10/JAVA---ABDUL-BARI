class MyData {
    int value = 0;

    boolean flag = true;

    synchronized void set(int v) {
        while(flag != true) {
            try { wait(); }
            catch(Exception e) {}
        }

        value = v;
        flag = false;
        notify();
    }

    synchronized int get() {
        int x = 0;

        while(flag != false) {
            try { wait(); }
            catch(Exception e) {}
        }

        x = value;
        flag = true;
        notify();

        return x;
    }
}

class Producer extends Thread {
    MyData d;

    Producer(MyData data) { d = data; }

    public void run() {
        int i = 1;

        while(true) {
            d.set(i);
            System.out.println("Producer : " +i);
            i++;
        }
    }
}

class Consumer extends Thread {
    MyData d;

    Consumer(MyData data) { d = data; }

    public void run() {
        while(true) {
            System.out.println("Consumer : " +d.get());
        }
    }
}

public class InterThreadCommunication {
    public static void main(String args[]) {
        MyData d = new MyData();

        Producer p = new Producer(d);
        Consumer c = new Consumer(d);

        p.start();
        c.start();
    }
}
