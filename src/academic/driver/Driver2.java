package academic.driver;

import academic.model.Student;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Driver untuk simulasi penambahan Student.
 */
public class Driver2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>(); // Menggunakan ArrayList untuk penyimpanan dinamis

        String line;
        while (input.hasNextLine() && !(line = input.nextLine()).equals("---")) {
            // Memisahkan setiap segmen data student
            String[] studentData = line.split("#");
            if (studentData.length == 4) {
                String studentId = studentData[0];
                String studentName = studentData[1];
                int entryYear = Integer.parseInt(studentData[2]); // Mengubah String menjadi int
                String major = studentData[3];

                // Membuat objek Student baru dan menambahkannya ke ArrayList
                Student newStudent = new Student(studentId, studentName, entryYear, major);
                students.add(newStudent);
            }
        }

        // Mencetak semua Student yang tersimpan
        for (Student student : students) {
            System.out.println(student); // Menggunakan method toString() dari kelas Student
        }

        input.close();
    }
}
