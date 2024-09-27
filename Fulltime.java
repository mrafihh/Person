package Project;

public class Fulltime extends Teacher {
    private int annualsalary;
    private String unit;

    public int getAnnualsalary() {
        return annualsalary;
    }

    public void setAnnualsalary(int annualsalary) {
        this.annualsalary = annualsalary;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Fulltime() {
        super();
        annualsalary = 0;
        unit = "";
    }

    public Fulltime(String name, int age, String subject, int annualsalary, String unit) {
        super(age, name, subject);
        this.annualsalary = annualsalary;
        this.unit = unit;
    }

    @Override

    public void print() {
        System.out.println("Salary : " + annualsalary);
        System.out.println("Unit : " + unit);
    }
}
