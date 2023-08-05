class Car {
    public void start() { System.out.println("Car Started"); }
    public void accelerate() { System.out.println("Car is Accelerated"); }
    public void changeGear() { System.out.println("Car Gear Changed"); }
}

class LuxuryCar extends Car {
    public void changeGear() { System.out.println("Automatic Gear"); }
    public void openRoof() { System.out.println("Open Car Roof"); }
}

public class Example2Overriding {
    public static void main(String args[]) {
        Car c = new Car();
        c.start();
        c.accelerate();
        c.changeGear();

        LuxuryCar lc = new LuxuryCar();
        lc.start();
        lc.accelerate();
        lc.changeGear();
        lc.openRoof();
    }
    
}
