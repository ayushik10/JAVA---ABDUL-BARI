class Test {
    static { System.out.println("Block 1"); }
    static { System.out.println("Block 2"); }
}

public class StaticBlocks {

  //  static { System.out.println("Static block 1"); }
    public static void main(String args[]) {
        System.out.println("Main");
        Test t = new Test();
    }

   // static { System.out.println("Static block 2"); }
}