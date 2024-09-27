package Project;

public class Teacher extends Person {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        subject = subject;
    }

    public Teacher(int age, String name, String subject) {
        this.subject = subject;

    }

    public Teacher() {
        super();
        subject = "";
    }

    public void print() {
        System.out.println("Mata Pelajaran : " + subject);
    }
}
