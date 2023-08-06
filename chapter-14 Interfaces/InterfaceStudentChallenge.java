interface Member {
    public void callback();
}

class Store {
    Member m[] =  new Member[100];
    int count = 0;

    void register(Member mem) {
        m[count++] = mem;
    }

    void inviteSale() {
        for(int i=0; i<count; i++) {
            m[i].callback();
        }
    }
}

class Customer implements Member { 
    String name;

    Customer(String n) {
        name = n;
    }

    public void callback() {
        System.out.println("ok, " +name+ " will visit store");
    }
}

public class InterfaceStudentChallenge {
    public static void main(String args[]) {
        Store s = new Store();
        Customer c1 = new Customer("Ayushi");
        Customer c2 = new Customer("Nisha");
        
        s.register(c1);
        s.register(c2);

        s.inviteSale();
    }
    
}
