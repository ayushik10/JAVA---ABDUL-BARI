class TV {
    public void switchON() { System.out.println("T.V. is Switched ON"); }
    public void changeChannel() { System.out.println("T.V. channel is changed"); }
}

class SmartTV extends TV {
    public void switchON() { System.out.println("Smart T.V. is Switched ON"); }
    public void changeChannel() { System.out.println("Smart T.V. channel is changed"); }
    public void browse() { System.out.println("Smart T.V. Browsing"); }
}

public class Example1Overriding {
    public static void main(String args[]) {
        //TV t = new TV();
        //t.switchON();
        //t.changeChannel();

        //SmartTV st = new SmartTV();
        //st.switchON();
        //st.changeChannel();
        //st.browse();

        TV t = new SmartTV();
        t.switchON();
        t.changeChannel();
        t.browse();
    }
    
}
