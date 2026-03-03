package academic.driver;

import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Driver untuk simulasi penambahan Course, Student, dan Enrollment secara bersamaan.
 */
public class Driver4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Enrollment> enrollments = new ArrayList<>();

        String line;
        while (input.hasNextLine() && !(line = input.nextLine()).equals("---")) {
            // Memisahkan segmen pertama untuk menentukan jenis entitas
            String[] data = line.split("#");
            if (data.length > 0) {
                String command = data[0]; // Perintah seperti "course-add", "student-add", "enrollment-add"

                switch (command) {
                    case "course-add":
                        // Pastikan ada cukup segmen untuk Course: command + courseCode + courseName + credits + grade
                        if (data.length == 5) {
                            String courseCode = data[1];
                            String courseName = data[2];
                            int credits = Integer.parseInt(data[3]);
                            String grade = data[4]; // Grade sesuai contoh input Task 04
                            Course newCourse = new Course(courseCode, courseName, credits, grade);
                            courses.add(newCourse);
                        }
                        break;
                    case "student-add":
                        // Pastikan ada cukup segmen untuk Student: command + studentId + studentName + entryYear + major
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
                        // Pastikan ada cukup segmen untuk Enrollment: command + courseCode + studentId + academicYear + semester
                        if (data.length == 5) {
                            String courseCode = data[1];
                            String studentId = data[2];
                            String academicYear = data[3];
                            String semester = data[4];
                            // Grade otomatis "None" karena menggunakan konstruktor default sesuai Task 03
                            Enrollment newEnrollment = new Enrollment(courseCode, studentId, academicYear, semester);
                            enrollments.add(newEnrollment);
                        }
                        break;
                    default:
                        // Abaikan baris jika perintah tidak dikenal
                        break;
                }
            }
        }

        // Mencetak semua Course - sesuai urutan permintaan
        for (Course course : courses) {
            System.out.println(course);
        }
        // Mencetak semua Student - sesuai urutan permintaan
        for (Student student : students) {
            System.out.println(student);
        }
        // Mencetak semua Enrollment - sesuai urutan permintaan
        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment);
        }

        input.close();
    }
}
