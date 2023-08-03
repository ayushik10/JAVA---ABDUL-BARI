/* Write a student class

 Properties - roll, name, course, m1,m2,m3;
 Methods - total(), average(), grade();
 
*/

class Student {
    public int roll;
    public String name;
    public String course;
    int m1, m2, m3;
    
    public int total() {
        return m1+m2+m3;
    }

    public int average() {
        return (total()/3);
    }

    public char grade() {
        if(average()>=60)
        return 'A';
        else
        return 'B';
    }

    public String details() {
        return "Roll no : "+roll+ "\nName : "+name+ "\nCourse : "+course;
    }
    
}

public class StudentTest {
    public static void main(String args[]) {
        Student s1 = new Student();

        s1.roll = 33;
        s1.name = "Ayushi Kumari";
        s1.course = "BCA";
        s1.m1 = 95;
        s1.m2 = 92;
        s1.m3 = 97;

        System.out.println("\n--Student Details-- \n" +(s1.details()));
        System.out.println("Total marks : " +(s1.total()));
        System.out.println("Averge : " +(s1.average()));
        System.out.println("Grade : " +(s1.grade())+"\n");
    } 
}