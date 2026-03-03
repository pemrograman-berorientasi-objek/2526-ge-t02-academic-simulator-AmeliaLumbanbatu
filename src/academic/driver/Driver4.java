package academic.driver;

import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 12S24031 - Amelia Renata Lumbanbatu
 */
public class Driver4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Enrollment> enrollments = new ArrayList<>();

        String line;
        while (input.hasNextLine() && !(line = input.nextLine()).equals("---")) {

            String[] data = line.split("#");
            if (data.length > 0) {
                String command = data[0]; 

                switch (command) {
                    case "course-add":
                        if (data.length == 5) {
                            String courseCode = data[1];
                            String courseName = data[2];
                            int credits = Integer.parseInt(data[3]);
                            String grade = data[4]; // Grade di sini mungkin placeholder, tapi sesuai contoh Task 01
                            Course newCourse = new Course(courseCode, courseName, credits, grade);
                            courses.add(newCourse);

                        }
                        break;
                    case "student-add":
                        if (data.length == 5) {
                            String studentId = data[1];
                            String studentName = data[2];
                            int entryYear = Integer.parseInt(data[3]);
                            String major = data[4];
                            Student newStudent = new Student(studentId, studentName, entryYear, major);
                            students.add(newStudent);

                        }
                        break;
                    case "enrollment-add":
                        if (data.length == 5) {
                            String courseCode = data[1];
                            String studentId = data[2];
                            String academicYear = data[3];
                            String semester = data[4];
                            Enrollment newEnrollment = new Enrollment(courseCode, studentId, academicYear, semester);
                            enrollments.add(newEnrollment);

                        }
                        break;
                    default:

                    break;
                }
            }
        }

        for (Course course : courses) {
            System.out.println(course);
        }

        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment);
        }

        input.close();
    }
}
