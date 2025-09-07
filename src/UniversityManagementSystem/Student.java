package UniversityManagementSystem;

import java.util.Scanner;

public class Student extends Person {
    private String studentID;
    private String email;
    private int[] grades = new int[5];
    private Course[] courses = new Course[3];

    public Student(String name, int age, String nationalID, String studentID, String email) {
        super(name, age, nationalID);
        this.studentID = studentID;
        this.email = email;
    }

    // getters
    public String getStudentID() { return studentID; }

    public String getEmail() {
        return email;
    }

    // setter just for email
    public void setEmail(String e) {
        email = e;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void enrollCourses(Scanner scanner) {
        System.out.print("How many courses? ");
        int count = scanner.nextInt();
        scanner.nextLine(); // may not be needed

        if (count > 3) {
            System.out.println("Too many courses!");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println("Enter course " + i);
            System.out.print("Code: ");
            String code = scanner.nextLine();

            System.out.print("Name: ");
            String cname = scanner.nextLine();

            System.out.print("Credit: ");
            int ch = scanner.nextInt();
            scanner.nextLine();

            Course crs = new Course(code, cname, ch);
            courses[i] = crs; // no check if already filled
        }
    }

    public void enrollGrades(Scanner scanner) {
        System.out.println("Input 5 grades:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Grade " + i + ": ");
            int g = scanner.nextInt();

            while (g < 0 || g > 100) {
                System.out.print("Re-enter grade " + i + ": ");
                g = scanner.nextInt();
            }

            grades[i] = g;
        }
    }

    public double calculateGPA() {
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum = sum + grades[i];
        }

        double avg = sum / 5.0;
        double gpa = avg / 25;

        return gpa;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("ID: " + studentID);
        System.out.println("Mail: " + email);

        for (int i = 0; i < courses.length; i++) {
            if (courses[i] != null) {
                courses[i].displayCourseInfo();
            }
        }
    }
}
