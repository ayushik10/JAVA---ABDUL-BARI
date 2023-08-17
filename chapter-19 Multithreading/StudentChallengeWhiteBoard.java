class WhiteBoard {
    String text;
    int numOfStud;
    int count = 0;

    synchronized public void write(String m) {
        System.out.println("Teacher is writing : " +m);

        while(count != 0) {
            try { wait(); }
            catch(Exception e) {}
        }

        text = m;
        count = numOfStud;
        notifyAll(); 
    }

    synchronized public String read() {
        while(count == 0) {
            try { wait(); }
            catch(Exception e) {}
        }
        String m = text;
        count--;

        if(count == 0)
        notify();
        return m;
    }

    public void attendence() {
        numOfStud++;
    }
}

class Teacher extends Thread {
    WhiteBoard w;

    String notes[] = {"JAVA ia an Object-Oriented Programming Language", "It is Platform Independent", "It supports the feature of Multithreading"};
    
    public Teacher(WhiteBoard wb) { w = wb; }

    public void run() {
        for(int i=0; i<notes.length; i++) 
        w.write(notes[i]);
    }
}

class Student extends Thread {
    WhiteBoard w;
    String name;

    public Student(String n, WhiteBoard wb) {
        name = n;
        w = wb;
    }

    public void run() {
        String text;
        w.attendence();

        do {
            text = w.read();
            System.out.println(name + " is reading " + text);
            System.out.flush();
        } 
        while(!text.equals("end"));
    }

}

public class StudentChallengeWhiteBoard {
    public static void main(String args[]) {

        WhiteBoard w = new WhiteBoard();
        Teacher t = new Teacher(w);

        Student s1 = new Student("1. Riya", w);
        Student s2 = new Student("2. Shaurya", w);
        Student s3 = new Student("3. Mini", w);
        Student s4 = new Student("4. Karan", w);

        t.start();

        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
