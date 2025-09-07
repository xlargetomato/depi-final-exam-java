import CarInheritanceSystem.Car;
import CarInheritanceSystem.ElectricCar;
import EmployeeSalarySystem.Employee;
import ProfileEncapsulation.User;
import ShapeAreaCalculator.Circle;
import ShapeAreaCalculator.Rectangle;
import ShapeAreaCalculator.Shape;
import UniversityManagementSystem.PostgraduateStudent;
import UniversityManagementSystem.Student;
import UniversityManagementSystem.UndergraduateStudent;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            /////////////////  Bank Account Manager & ATM Simulation [It's both same logic] ///////////////// #1 & #2

//        Bank();

            /////////////////  Shape Area Calclutor ///////////////// #3

//        ShapeAreaCalclator();

            ///////////  Student Grades Menu Using Switch //////////#4

//        StudentGradesMenuUsingSwitch();

            //////////////  Loan Eligibility Checker ///////////// #5

//        checkEligibility();

            //////////////// Password Validator //////////////// #6

//            sValidPassword();

            ////////////////  Car Inheritance System  //////////////// #7

//            Car c1 = new Car("BMW", "BMW 123", 2021);
//            ElectricCar ec1 = new ElectricCar("Toyota", " ewq4321", 2019, 80);
//
//            c1.displayInfo();
//            System.out.println("\n=-=-=-=-=-=-=-=-=-=\n");
//            ec1.displayInfo();

            ////////////////  User Profile Encapsulation  //////////////// #8

//            User user = new User();
//            user.setName("Ahmed");
//            user.setAge(21);
//            user.setEmail("ahmed@gmail.com");
//
//            System.out.println(user.getName());
//            System.out.println(user.getAge());
//            System.out.println(user.getEmail());

            ////////////////  Prime Numbers in Range  ///////////////// #9

//            Scanner input = new Scanner(System.in);
//            int number = input.nextInt();
//
//            for (int i = 0; i < number; i++) {
//                if (isPrime(i))
//                {
//                    System.out.print(i + " ");
//                }
//            }

            //////////////////  Factorial Calculator  ////////////////// #10

//            Scanner input = new Scanner(System.in);
//
//            System.out.print("Enter a number to calculate factorial : ");
//            int n = input.nextInt();
//
//            if (n < 0) {
//                System.out.println("Factorial is not defined for negative numbers");
//            } else {
//                int result = calculateFactorial(n);
//                System.out.println("Factorial of " + n + " is : " + result);
//            }

            ////////////////   Multiplication Table Generator  //////////////// #11

//            multiplicationTable();

            ////////////////   Calculator Using Switch  //////////////// #12

//            Scanner input = new Scanner(System.in);
//            System.out.println("Write First Number");
//            double first = input.nextDouble();
//
//            System.out.println("Write Second Number");
//            double second = input.nextDouble();
//
//            System.out.println("Write The Operator");
//            char operator = input.next().charAt(0);
//
//            System.out.println(Calculator(first, second, operator));

            /////////////////  Employee Salary System  ///////////////// ##13

//            EmployeeSalarySystem();

            /////////////////  Login Attempt Tracker   ///////////////// #14

//            LoginAttempt();

            /////////////////  Odd and Even Counter  ///////////////// #15

//            OddEvenCounter();

            /////////////////   Palindrome Checker  /////////////////#16

//            Scanner input = new Scanner(System.in);
//
//            System.out.print("Enter a word to : ");
//            String word = input.nextLine();
//
//            if (isPalindrome(word)) {
//                System.out.println("it is a palindrome");
//            } else {
//                System.out.println("it is not a palindrome");
//            }

            /// //////////////// Student Result System  /////////////////// #17

//            Scanner scanner = new Scanner(System.in);
//
//            Student student = new Student();
//            student.inputData(scanner);
//            student.displayResult();

            /// //////////////// Reverse Number  ///////////////////#18

//            reverseNumber();

            /// //////////////// Guess The Number Game  ///////////////////#19

//            GuessTheNumberGame();

            /// //////////////// Ticket Price Calculator  /////////////////// #20

//            Scanner scanner = new Scanner(System.in);
//
//            // Take inputs
//            System.out.print("Enter your age: ");
//            int age = scanner.nextInt();
//
//            System.out.print("Enter trip type (1 = One-way, 2 = Round-trip): ");
//            int tripType = scanner.nextInt();
//
//            // Calculate and display ticket price
//            double price = calculatePrice(age, tripType);
//
//            if (price != -1) {
//                System.out.println("Total ticket price: $" + price);
//            }
            /// ////////////////  //////////////////////////////////////////////////

            UniversitySystem();

        }

        private static void Bank() {
            Scanner input = new Scanner(System.in);


            System.out.println("=== Bank Account Manager ===");
            System.out.println("Please Enter The Account Number: ");
            String accountName = input.nextLine();

            System.out.println("Please Enter The Owner Name: ");
            String ownerName = input.nextLine();

            System.out.println("Please Enter The Amount: ");
            double amount = input.nextDouble();

            BankAccount bankAccount = new BankAccount(accountName, ownerName, amount);

            boolean continueOperationsOrNot = true;

            while (continueOperationsOrNot) {
                System.out.println("\nEnter: \n" +
                        "1: Show Account Number \n" +
                        "2: Update Account Number \n" +
                        "3: Show Balance \n" +
                        "4: Show Owner Name \n" +
                        "5: Update Owner Name \n" +
                        "6: Deposit \n" +
                        "7: Withdraw \n" +
                        "0: Exit");

                int num = input.nextInt();
                input.nextLine();

                switch (num) {
                    case 1:
                        System.out.println("Account Number: " + bankAccount.getAccountNumber());
                        break;
                    case 2:
                        System.out.println("Enter the new account number: ");
                        String accountNumberUpdate = input.nextLine();
                        bankAccount.setAccountNumber(accountNumberUpdate);
                        System.out.println("Account number updated.");
                        break;
                    case 3:
                        System.out.println("Balance: $" + bankAccount.getBalance());
                        break;
                    case 4:
                        System.out.println("Owner Name: " + bankAccount.getOwnerName());
                        break;
                    case 5:
                        System.out.println("Enter the new owner name: ");
                        String ownerNameUpdate = input.nextLine();
                        bankAccount.setOwnerName(ownerNameUpdate);
                        System.out.println("Owner name updated.");
                        break;
                    case 6:
                        System.out.println("Enter amount to deposit: ");
                        double depositAmount = input.nextDouble();
                        bankAccount.Deposit(depositAmount);
                        input.nextLine();
                        break;
                    case 7:
                        System.out.println("Enter amount to withdraw: ");
                        double withdrawAmount = input.nextDouble();
                        bankAccount.Withdraw(withdrawAmount);
                        input.nextLine();
                        break;
                    case 0:
                        continueOperationsOrNot = false;
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid input. Try again.");
                        break;
                }

                if (num != 0) {
                    System.out.print("\nDo you want to perform another operation? (yes/no): ");
                    String response = input.nextLine();
                    if (!response.equals("yes")) {
                        continueOperationsOrNot = false;
                        System.out.println("Exiting...");
                    }
                }
            }

        }

        private static void ShapeAreaCalclator() {
            Scanner input = new Scanner(System.in);

            System.out.println("\n=== Shape Area Calculator ===");
            System.out.println("Which shape area do you want to calculate?");
            System.out.println("Enter 'rectangle' or 'circle' [DO NOT USE UPPERCASE]: ");
            String shapeChoice = input.nextLine();

            Shape shape;

            switch (shapeChoice) {
                case "rectangle":
                    System.out.print("Enter width: ");
                    double width = input.nextDouble();
                    System.out.print("Enter height: ");
                    double height = input.nextDouble();
                    shape = new Rectangle(width, height);
                    break;
                case "circle":
                    System.out.print("Enter radius: ");
                    double radius = input.nextDouble();
                    shape = new Circle(radius);
                    break;
                default:
                    System.out.println("Invalid shape type!");
                    input.close();
                    return;
            }

            double area = shape.calculateArea();
            System.out.printf("The area of the %s is: %.2f\n", shapeChoice, area);
        }

        private static void StudentGradesMenuUsingSwitch() {
            Scanner input = new Scanner(System.in);

            boolean marksEntered = false;
            boolean running = true;
            int marks = 0;

            while (running) {
                System.out.println("\n=== Student Grades Menu ===");
                System.out.println("1. Enter student marks");
                System.out.println("2. Display grade");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");

                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter Student Marks : ");
                        marks = input.nextInt();
                        marksEntered = true;
                        break;
                    case 2:
                        if (!marksEntered) {
                            System.out.println("Please enter marks first (option 1).");
                        } else {
                            char grade;

                            if (marks >= 90 && marks <= 100) {
                                grade = 'A';
                            } else if (marks >= 80) {
                                grade = 'B';
                            } else if (marks >= 70) {
                                grade = 'C';
                            } else if (marks >= 60) {
                                grade = 'D';
                            } else {
                                grade = 'F';
                            }

                            System.out.println("Grade: " + grade);

                        }
                        break;
                    case 3:

                        running = false;
                        break;
                    default:
                        System.out.println("Please Enter Valid Input");
                        break;
                }
            }
        }

        private static void checkEligibility() {

            Scanner input = new Scanner(System.in);

            System.out.println("Please Enter Your Age : ");
            int Age = input.nextInt();
            System.out.println("Please Enter Your Salary : ");
            double monthlySalary = input.nextDouble();
            System.out.println("Please Enter Your Years Of Experience : ");
            int yearsOfExperience = input.nextInt();

            if (Age > 21 && monthlySalary > 3000 && yearsOfExperience > 2) {
                System.out.println("eligible");
            } else {
                System.out.println("Not eligible");
            }
        }

        private static void sValidPassword() {
            Scanner input = new Scanner(System.in);
            String password;
            boolean validate = false;
            while (!validate) {
                System.out.print("Enter a password: ");
                password = input.nextLine();

                if (ValidPasswordPasswordInputCheck(password)) {
                    System.out.println("Password is valid!");
                    break;
                } else {
                    System.out.println("Invalid password. Try again.");
                    System.out.println("Password must be at least 8 characters long, contain at least one uppercase letter, and at least one digit.\n");
                }
            }

        }

        private static boolean ValidPasswordPasswordInputCheck(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasDigit = false;

        char[] arr = password.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                hasUppercase = true;
            }
            if (Character.isDigit(arr[i])) {
                hasDigit = true;
            }
        }

        if (hasUppercase == true && hasDigit == true)
        {
            return true;
        } else {
            return false;
        }

    }

        private static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }

            return true;
        }

        public static int calculateFactorial(int n) {
        int factorial = 1;
        int i = 1;

        while (i <= n) {
            factorial *= i;
            i++;
        }

        return factorial;
        }

        public static void  multiplicationTable() {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number to make multiplication table for it ");

        int num = input.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(num + " x " + i + " = " +  (i * num));
        }

        }

        public static Double Calculator(double num1, double num2, char operator) {

                    switch (operator) {
                        case '+':
                            return num1 + num2;
                        case '-':
                            return num1 - num2;
                        case '*':
                            return num1 * num2;
                        case '/':
                            if (num2 == 0) {
                                System.out.println("cannot be divided by zero");
                                return null;
                            }
                            return num1 / num2;
                        default:
                            System.out.println("Invalid operator");
                            return 0.0;
                    }

            }

        public static void EmployeeSalarySystem () {
            Scanner input = new Scanner(System.in);

            // Input for 3 employees //
            Employee[] employees = new Employee[3];


            for (int i = 0; i < employees.length; i++) {
                System.out.println("\nEnter details for Employee " + (i + 1) + ":");

                System.out.print("Name: ");
                String name = input.nextLine();

                System.out.print("Hours Worked: ");
                int hoursWorked = input.nextInt();

                System.out.print("Hourly Rate: ");
                double hourlyRate = input.nextDouble();

                input.nextLine();

                employees[i] = new Employee(name, hoursWorked, hourlyRate);
            }


            System.out.println("\n=== Employee Salaries ===");
            for (Employee emp : employees) {
                System.out.println(emp.name + " - Salary: $" + emp.calculateSalary());
            }
        }

        public static void LoginAttempt() {
            Scanner input = new Scanner(System.in);

            String correctUsername = "admin";
            String correctPassword = "1234";

            int attempts = 0;
            boolean success = false;

            while (attempts < 3) {
                System.out.print("Enter username: ");
                String username = input.nextLine();

                System.out.print("Enter password: ");
                String password = input.nextLine();

                if (username.equals(correctUsername) && password.equals(correctPassword)) {
                    System.out.println("Login successful!");
                    success = true;
                    break;
                } else {
                    attempts++;
                    if (attempts < 3) {
                        System.out.println("Incorrect credentials Try again.");
                    }
                }
            }

            if (!success) {
                System.out.println("Account locked.");
            }


        }

        public static void  OddEvenCounter() {

            Scanner input = new Scanner(System.in);


            int[] numbers = new int[10];
            int odd = 0;
            int even = 0;

            System.out.println("Please enter 10 numbers and i will send back how many odd and even numbers in it :");

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = input.nextInt();
            }

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            System.out.println("there is [" + even + "] even numbers" );
            System.out.println("there is [" + odd + "] odd numbers" );
    }

        public static boolean isPalindrome(String word) {
            word = word.toLowerCase();
            int left = 0;
            int right = word.length() - 1;

            while (left < right) {
                if (word.charAt(left) != word.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }

        public static void reverseNumber() {
            Scanner scanner = new Scanner(System.in);

            // Take input from the user
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            String numberStr = Integer.toString(number);
            String reversedStr = "";

            // Loop through the string in reverse order
            for (int i = numberStr.length() - 1; i >= 0; i--) {
                reversedStr += numberStr.charAt(i);
            }

            System.out.println("Reversed number: " + reversedStr);

        }

        public  static void GuessTheNumberGame() {

            Scanner input = new Scanner(System.in);
            Random random = new Random();

            int randomNumber = random.nextInt(1000);
            int counter = 1;
            int maxAttempts = 5;
            System.out.println("Guess the number between 0 and 1000 in only 5 attempts");

            int num = input.nextInt();

    //        System.out.println(randomNumber);

            while (counter < maxAttempts && num != randomNumber)
            {
                if (num >= randomNumber - 5 && num < randomNumber) {
                    System.out.println("Wrong answer number is Low, but very close Attempt " + counter);
                }
                else if (num <= randomNumber + 5 && num > randomNumber) {
                    System.out.println("Wrong answer number is High, but very close Attempt " + counter);
                }
                else if (num < randomNumber) {
                    System.out.println("Wrong answer number is Too Low Attempt " + counter);

                }
                else {
                    System.out.println("Wrong answer number is Too high Attempt " + counter);
                }

                if (counter == 4)
                {
                    System.out.println("This is last attempt !");
                }

                counter++;
                num = input.nextInt();


            }

            if (num == randomNumber)
            {
                System.out.println("Congratulations! Tou guessed it right");
            } else {
                System.out.println("You lost the number was " + randomNumber);
            }

        }

        public static double calculatePrice(int age, int tripType) {
                double basePrice = 100;
                double discount = 0;

                if (age < 12) {
                    discount = 0.5;
                } else if (age >= 12 && age <= 24) {
                    discount = 0.1;
                } else {
                    discount = 0.0;
                }

                double priceAfterAgeDiscount = basePrice * (1 - discount);

                switch (tripType) {
                    case 1:
                        return priceAfterAgeDiscount;

                    case 2:
                        double roundTripDiscount = priceAfterAgeDiscount * 0.2;
                        double finalPrice = (priceAfterAgeDiscount - roundTripDiscount) * 2;
                        return finalPrice;

                    default:
                        System.out.println("Invalid trip type.");
                        return -1;
                }
            }


    public static void UniversitySystem() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<UniversityManagementSystem.Student> students = new ArrayList<>();

        int choice;
        do {
            System.out.println("=== University System ===");
            System.out.println("1. Add Student");
            System.out.println("2. Enroll in Courses");
            System.out.println("3. Input Grades");
            System.out.println("4. Display Student Info");
            System.out.println("5. Calculate GPA");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Student Type: 1. Undergraduate  2. Postgraduate");
                    int type = scanner.nextInt(); scanner.nextLine();

                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Age: ");
                    int age = scanner.nextInt(); scanner.nextLine();

                    if (age <= 16) {
                        System.out.println("Sorry, too young.");
                        break;
                    }

                    System.out.print("National ID: ");
                    String nationalID = scanner.nextLine();

                    System.out.print("Student ID: ");
                    String studentID = scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    if (type == 1) {
                        System.out.print("Year Level: ");
                        String year = scanner.nextLine();
                        students.add(new UndergraduateStudent(name, age, nationalID, studentID, email, year));
                    } else if (type == 2) {
                        System.out.print("Thesis: ");
                        String thesis = scanner.nextLine();
                        students.add(new PostgraduateStudent(name, age, nationalID, studentID, email, thesis));
                    } else {
                        System.out.println("Wrong type selected.");
                    }
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine(); // short var
                    Student student = findStudentByID(students, id);
                    if (student == null) {
                        System.out.println("Student not found");
                        break;
                    }
                    student.enrollCourses(scanner);
                    break;

                case 3:
                    System.out.print("ID to input grades: ");
                    String gID = scanner.nextLine();
                    Student s2 = findStudentByID(students, gID);
                    if (s2 != null) {
                        s2.enrollGrades(scanner);
                    }
                    break;

                case 4:
                    for (Student st : students) {
                        st.displayInfo();
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.print("Student ID: ");
                    String calcID = scanner.nextLine();
                    Student found = findStudentByID(students, calcID);
                    if (found != null) {
                        double gpa = found.calculateGPA();
                        System.out.printf("GPA: ", gpa);
                    }
                    break;

                case 6:
                    System.out.println("See you.");
                    break;

                default:
                    System.out.println("Error choice.");
            }

        } while (choice != 6);
    }

    public static Student findStudentByID(ArrayList<Student> students, String id) {
        for (Student s : students) {
            if (s.getStudentID().equals(id)) {
                return s;
            }
        }
        return null;
    }


    }




