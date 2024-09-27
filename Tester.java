package Project;

import java.util.Scanner;

public class Tester {
    private static Scanner scanner;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("1.Students / 2.Teacher");
        int pilihan = in.nextInt();

        System.out.println("Name : ");
        String name = in.next();
        System.out.println("Age : ");
        int age = in.nextInt();

        in.nextLine();

        if (pilihan == 1) {
            System.out.println("Student Number");
            int studentNumber = in.nextInt();
            System.out.println("Score : ");
            int score = in.nextInt();
            System.out.println("Major : ");
            String major = in.nextLine();
            Student c1 = new Student(name, age, studentNumber, score, major);
            c1.print();
        } else if (pilihan == 2) {
            System.out.println("1.Full Time / 2.Part Time");
            int pilih = in.nextInt();

            if (pilih == 1) {
                System.out.println("Annual Salary : ");
                int annualsalary = in.nextInt();
                System.out.println("Unit : ");
                String unit = in.next();
                System.out.println("Subject : ");
                String subject = in.next();
                Fulltime c2 = new Fulltime(name, age, subject, annualsalary, unit);
                c2.print();
            } else if (pilih == 2) {
                System.out.println("Hours Worked ");
                int hoursworked = in.nextInt();
                String subject = in.nextLine();
                PartTime c3 = new PartTime(name, age, subject, hoursworked);
                c3.print();
            } else {
                System.out.println("Input Salah");
            }

        }
        scanner.close();
    }
}
