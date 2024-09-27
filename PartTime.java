package Project;

public class PartTime extends Teacher {
    private int hoursworked;

    public int getHoursworked() {
        return hoursworked;
    }

    public void setHoursworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }

    public PartTime(String name, int age, String subject, int hoursworked) {
        super();
        hoursworked = 0;
    }

    public PartTime(String name, int age, String subject, int annualsalary, String unit) {
        super(age, name, subject);
    }

    private double calculatesalary() {
        return hoursworked * 4 * 20000;
    }

    @Override

    public void print() {
        System.out.println("Hours worked : " + hoursworked + "hours per week");
    }
}
