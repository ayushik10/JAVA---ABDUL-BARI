class Student {

    private int rollNo;
    private String name;
    private String dept;
    private String subjects;

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return dept;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubject(String sub) {
        subjects = sub;
    }

    public Student(int rollNo, String name, String dept, String subjects) {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        this.subjects = subjects;
    }
    
    public Student(int rollNo, String name, String dept) {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
    }

    public String toString() {
        return "\nRoll No : "+rollNo+ "\nName : "+name+ "\nDepartment : "+dept+ "\nSubjects: "+subjects;
    }
    
}

public class StudentChallenge {

    public static void main(String args[]) {

        Student s[]=new Student[2];
        s[0] = new Student(11,"Ayushi","BCA", "JAVA, OS");
        s[1] = new Student(32,"Riya","MCA");
       
        for(Student st:s)
        System.out.println(st);
    }
    
}
