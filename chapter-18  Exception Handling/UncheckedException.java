public class UncheckedException {

    static void fun1() {
        try {
            System.out.println(10/0);
        }

        catch(Exception e) {
            System.out.println(e.getMessage());
           // e.printStackTrace();
        }
    }

    static void fun2() {
        fun1();
    }

    static void fun3() {
        fun2();
    }

    public static void main(String args[]) {
        fun3();
    }
}
