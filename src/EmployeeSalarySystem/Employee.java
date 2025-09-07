package EmployeeSalarySystem;

public class Employee {

    public String name;
    int hoursWorked;
    double hourlyRate;

   public Employee(String name, int hourlyWorked, double hourlyRate) {
       this.hourlyRate = hourlyRate;
       this.hoursWorked = hourlyWorked;
       this.name = name;
   }
   public double calculateSalary() {
       return hoursWorked * hourlyRate;
   }
}
