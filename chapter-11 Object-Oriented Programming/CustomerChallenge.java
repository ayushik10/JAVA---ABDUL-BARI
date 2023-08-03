class Customer {
    public String custId;
    public String name;
    public String phNo;
    public String address;

    public String getCustId() {
        return custId;
    }

    public String getName() {
        return name;
    }

    public String getPhno() {
        return phNo;
    }

    public String getAddress() {
        return address;
    }

    public void setPhno(String p) {
        phNo = p;
    }

    public void setAddress(String a) {
        address = a;
    }

    Customer(String c, String n)  {
        custId = c;
        name = n;
        phNo = "**** **** **";
        address = "*****";
    }

    Customer(String c, String n, String p, String a) {
        custId = c;
        name = n;
        phNo = p;
        address = a;
    }
}

public class CustomerChallenge {
    public static void main(String args[]) {

        Customer c1 = new Customer("123AK", "Ayushi Kumari");
        Customer c2 = new Customer("654GH", "Gyan Hemant", "9999 8888 77", "Mumbai");

        System.out.println("\n--Customer 1--");
        System.out.println("ID : " +c1.getCustId());
        System.out.println("NAME : " +c1.getName());
        System.out.println("PHONE NO : " +c1.getPhno());
        System.out.println("ADDRESS : " +c1.getAddress());

        System.out.println("\n--Customer 2--");
        System.out.println("ID : " +c2.getCustId());
        System.out.println("NAME : " +c2.getName());
        System.out.println("PHONE NO : " +c2.getPhno());
        System.out.println("ADDRESS : " +c2.getAddress());
    }
}