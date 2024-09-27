package Project;

public class Student extends Person {
    private int studentNumber;
    private int score;
    private String major;

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Student() {
        super();
        studentNumber = 0;
        score = 0;
        major = "";
    }

    public Student(String name, int age, int studentNumber, int score, String major) {
        this.studentNumber = studentNumber;
        this.score = score;
        this.major = major;
    }

    public void print(String name, int age, int studentNumber2, int score2, String major2) {
        System.out.println("Nomor Absen : " + studentNumber);
        System.out.println("Nilai : " + score);
        System.out.println("Major : " + major);
    }
}
