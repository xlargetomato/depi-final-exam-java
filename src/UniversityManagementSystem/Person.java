package UniversityManagementSystem;

public class Person {
    protected String name;
    protected int age;
    protected String nationalID;

    public Person(String name, int age, String nationalID) {
        this.name = name;
        this.age = age;
        this.nationalID = nationalID;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("National ID: " + nationalID);
    }
}
