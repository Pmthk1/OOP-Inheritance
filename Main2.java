class UniversityMember {
    private String ID;
    private String Name;

    public UniversityMember(String ID, String Name) {
        this.ID = ID;
        this.Name = Name;
    }

    public String getID() { return ID; }
    public void setID(String ID) { this.ID = ID; }

    public String getName() { return Name; }
    public void setName(String Name) { this.Name = Name; }

    public void attend() {
        System.out.println(Name + " is attending the university");
    }
}

class Student extends UniversityMember {
    private String major;

    public Student(String ID, String Name, String major) {
        super(ID, Name);
        this.major = major;
    }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public void study() {
        System.out.println(getName() + " is studying " + major);
    }
}

class GraduateStudent extends Student {
    private String researchTopic;

    public GraduateStudent(String ID, String Name, String major, String researchTopic) {
        super(ID, Name, major);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() { return researchTopic; }
    public void setResearchTopic(String researchTopic) { this.researchTopic = researchTopic; }

    public void Research() {
        System.out.println(getName() + " is researching on " + researchTopic);
    }
}

public class Main2 {
    public static void main(String[] args) {

        GraduateStudent graduateStudent = new GraduateStudent("GS123", "John Doe", "Software Engineer", "OOP");
        System.out.println("Name: " + graduateStudent.getName());
        System.out.println("ID: " + graduateStudent.getID());
        System.out.println("Major: " + graduateStudent.getMajor());
        System.out.println("Research Topic: " + graduateStudent.getResearchTopic());

        graduateStudent.attend();
        graduateStudent.study();
        graduateStudent.Research();

        graduateStudent.setResearchTopic("Back End Dev");
        graduateStudent.Research();
    }
}