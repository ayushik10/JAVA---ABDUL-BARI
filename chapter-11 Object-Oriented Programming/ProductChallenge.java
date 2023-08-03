class Product {
    private String itemNo;
    private String name;
    private double price;
    private int quantity;

    public String getItemNo() {
        return itemNo;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double p) {
        price = p;
    }

    public void setQuantity(int q) {
        quantity = q;
    }

    public Product(String i, String n) {
        itemNo = i;
        name = n;
        price = 0;
        quantity = 0;
    }

    public Product(String i, String n, double p, int q) {
        itemNo = i;
        name = n;
        price = p;
        quantity = q;
    }
}

public class ProductChallenge {
    public static void main(String args[]) {
        
        Product p1 = new Product("11A23HJ", "MILK");
        Product p2 = new Product("23QR56T", "PERFUME", 350, 2);

        System.out.println("\n--Product 1--");
        System.out.println("PRODUCT NO : " +p1.getItemNo());
        System.out.println("PRODUCT NAME : " +p1.getName());
        System.out.println("PRICE OF THE PRODUCT : " +p1.getPrice());
        System.out.println("QUANTITY OF THE PRODUCT : " +p1.getQuantity());

        System.out.println("\n--Product 2--");
        System.out.println("PRODUCT NO : " +p2.getItemNo());
        System.out.println("PRODUCT NAME : " +p2.getName());
        System.out.println("PRICE OF THE PRODUCT : " +p2.getPrice());
        System.out.println("QUANTITY OF THE PRODUCT : " +p2.getQuantity()+"\n");
    }
}