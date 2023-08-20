enum Dept2
{
    CS("Alice", "Block A"), IT("Shreya", "Block B"), CIVIL("Rahul", "Block C"), ECE("Grammy", "Block D");

    String head;
    String location;

    private Dept2(String h, String l) {
        this.head = h;
        this.location = l;
    }

    public String getHeadName() {
        return head;
    }

    public String getLocation() {
        return location;
    }
}

public class EnumDept 
{
    public static void main(String args[]) 
    {
        Dept2 d1 = Dept2.CS;

        System.out.println(d1.getHeadName());
        System.out.println(d1.getLocation());
    }    
}
