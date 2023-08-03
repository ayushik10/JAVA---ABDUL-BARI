class Subject {
    
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtained;

    public Subject(String subID, String name) {
        this.subID = subID;
        this.name = name;
        this.maxMarks = 100;
        this.marksObtained = 0;
    }

    public Subject(String subID,String name,int maxMarks) {
        this.subID = subID;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    public String getSubID() {
        return subID;
    }

    public String getName() {
        return name;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtained() {
        return marksObtained;
    }

    public void setMaxMarks(int mm) {
        maxMarks = mm;
    }
    
    public void setMarksObtain(int m) {
        marksObtained = m;
    }
    
    boolean isQualified() {
        return (marksObtained >= maxMarks/10*4);
    }
    
    public String toString() {
        return "\n SubjectID: "+subID+ "\n Name "+name+ "\n MarksObtained "+ marksObtained;
    }
}

public class SubjectChallenge {
    public static void main(String args[]) {

        Subject s[]=new Subject[4];
        s[0]=new Subject("401","JAVA",100);
        s[1]=new Subject("402","Operating System",100);
        s[2]=new Subject("403","Graphics");
        s[3]=new Subject("404","Softare Engineering");
        
        for(Subject sub:s)
        System.out.println(sub);
    
    }
    
}
