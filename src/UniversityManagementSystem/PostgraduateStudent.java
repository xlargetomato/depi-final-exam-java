package UniversityManagementSystem;

public class PostgraduateStudent extends Student {
    private String thesisTitle;

    public PostgraduateStudent(String name, int age, String nationalID, String studentID, String email, String thesisTitle) {
        super(name, age, nationalID, studentID, email);
        this.thesisTitle = thesisTitle;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Thesis Title: " + thesisTitle);
    }
}
