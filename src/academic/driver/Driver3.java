package academic.driver;

import academic.model.Enrollment;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 12S24031 - Amelia Renata Lumbanbatu
 */
public class Driver3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Enrollment> enrollments = new ArrayList<>();

        String line;
        while (input.hasNextLine() && !(line = input.nextLine()).equals("---")) {

            String[] enrollmentData = line.split("#");
            if (enrollmentData.length == 4) {
                String courseCode = enrollmentData[0];
                String studentId = enrollmentData[1];
                String academicYear = enrollmentData[2];
                String semester = enrollmentData[3];

                Enrollment newEnrollment = new Enrollment(courseCode, studentId, academicYear, semester);
                enrollments.add(newEnrollment);
            }
        }

        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment);
        }

        input.close();
    }

}