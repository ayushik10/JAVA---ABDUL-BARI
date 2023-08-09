class CoffeeMachine {
    private float coffeeQty;
    private float waterQty;
    private float milkQty;
    private float sugar;

    static private CoffeeMachine cup = null;

    private CoffeeMachine() {
        coffeeQty = 1;
        waterQty = 1;
        milkQty = 1;
        sugar = 1;
    }

    public void fillwater(float w) { waterQty = w;}
    public void fillsuger(float s) { sugar = s; }

    public float getCoffee() {
        return 0.25f;
    }

    static public CoffeeMachine getInstance() {
        if(cup==null) {
            cup = new CoffeeMachine();
        }
        return cup;
    }
}

public class SingletonClass {
    public static void main(String args[]) {

        CoffeeMachine m1 = CoffeeMachine.getInstance();
        CoffeeMachine m2 = CoffeeMachine.getInstance();
        CoffeeMachine m3 = CoffeeMachine.getInstance();
         
        System.out.println(m1+ " " +m2+ " " +m3);

        if(m1==m2 && m1==m3) {
            System.out.println("SAME");
        }
    }
    
}
