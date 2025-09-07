package UniversityManagementSystem;

public class UndergraduateStudent extends Student {
    private String yearLevel;

    public UndergraduateStudent(String name, int age, String nationalID, String studentID, String email, String yearLevel) {
        super(name, age, nationalID, studentID, email);
        this.yearLevel = yearLevel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Year Level: " + yearLevel);
    }
}
