class Phone {
    public void call() {
        System.out.println("Phone Call");
    }

    public void sms() {
        System.out.println("Phone sending SMS");
    }
}

interface ICamera {
    void click();
    void record();
}

interface IMusicPlayer {
    void play();
    void pause();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer {
    public void videoCall() {
        System.out.println("SmartPhone VideoCalling");
    }

    public void click() {
        System.out.println("SmartPhone Clicking Photo");
    }

    public void record() {
        System.out.println("SmartPhone Recording Video");
    }

    public void play() {
        System.out.println("SmartPhone Playing Music");
    }

    public void pause() {
        System.out.println("SMartPhone Paused the Music");
    }
} 

public class InterfaceExample {
    public static void main(String args[]) {
        SmartPhone sp =   new SmartPhone();
        sp.call();
        sp.click();
        sp.sms();
        //sp.videoCall();
        //sp.play();
        //sp.pause();
        //sp.record();

        ICamera c = new SmartPhone() ;
        c.click();

        IMusicPlayer mp = new SmartPhone();
        mp.play();
        mp.pause();
    }
}
