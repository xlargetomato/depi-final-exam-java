package UniversityManagementSystem;

    public class Course {
        private String courseCode;
        private String courseName;
        private int creditHours;

        public Course(String courseCode, String courseName, int creditHours) {
            this.courseCode = courseCode;
            this.courseName = courseName;
            this.creditHours = creditHours;
        }

        public void displayCourseInfo() {
            System.out.println("Course Code: " + courseCode);
            System.out.println("Course Name: " + courseName);
            System.out.println("Credit Hours: " + creditHours);
        }
    }


