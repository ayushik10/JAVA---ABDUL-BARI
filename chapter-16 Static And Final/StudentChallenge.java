import java.sql.Date;

class Student {
    private String roll;
    private static int count = 1;

    private String provideRoll() {
        Date d = new Date(0);
        String r = "Univ-" +(d.getYear()+1900) + "-" +count;
        count++;
        return r;
    }

    Student() {
        roll = provideRoll();
    }

    public void show() {
        System.out.println("Roll no : " +roll);
    }
}

public class StudentChallenge {
    public static void main(String args[]) {
        
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

        s1.show();
        s2.show();
        s3.show();
        s4.show();
    }
}
