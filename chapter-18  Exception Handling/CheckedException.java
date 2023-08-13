import java.io.*;

public class CheckedException {

    static void fun1() {
        //checked
        //FileInputStream f = new FileInputStream("My.txt");
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
