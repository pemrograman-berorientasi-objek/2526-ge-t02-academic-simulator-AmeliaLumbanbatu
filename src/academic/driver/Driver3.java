package academic.driver;

import academic.model.Enrollment;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Driver untuk simulasi penambahan Enrollment.
 */
public class Driver3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Enrollment> enrollments = new ArrayList<>(); // Menggunakan ArrayList untuk penyimpanan dinamis

        String line;
        while (input.hasNextLine() && !(line = input.nextLine()).equals("---")) {
            // Memisahkan setiap segmen data enrollment
            String[] enrollmentData = line.split("#");
            if (enrollmentData.length == 4) {
                String courseCode = enrollmentData[0];
                String studentId = enrollmentData[1];
                String academicYear = enrollmentData[2];
                String semester = enrollmentData[3];

                // Membuat objek Enrollment baru dan menambahkannya ke ArrayList
                // Grade akan otomatis "None" karena menggunakan konstruktor yang sesuai
                Enrollment newEnrollment = new Enrollment(courseCode, studentId, academicYear, semester);
                enrollments.add(newEnrollment);
            }
        }

        // Mencetak semua Enrollment yang tersimpan
        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment); // Menggunakan method toString() dari kelas Enrollment
        }

        input.close();
    }
}
