package StudentResultSystem;

import java.util.Scanner;

public class Student {
    String name;
    int[] marks = new int[5];

    public void inputData(Scanner scanner) {
        System.out.print("Enter student name: ");
        name = scanner.nextLine();

        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    public double calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    public String getGrade(double average) {
        if (average >= 90) return "A";
        else if (average >= 80) return "B";
        else if (average >= 70) return "C";
        else if (average >= 60) return "D";
        else return "F";
    }

    public void displayResult() {
        double average = calculateAverage();
        String grade = getGrade(average);

        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}