public class ThreadTest2 extends Thread {
    public void run() {

        int i=1;
        while(true) {
            System.out.println(i+ " Hello ");
            i++;
        }
    }

    public static void main(String[] args) {
        ThreadTest2 m = new ThreadTest2();
        m.start();

        int i=1;
        while(true) {
            System.out.println(i+ " World");
            i++;
        }
    }
}
