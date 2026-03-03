package academic.driver;

import academic.model.Student;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 12S24031 - Amelia Renata Lumbanbatu
 */
public class Driver2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        String line;
        while (input.hasNextLine() && !(line = input.nextLine()).equals("---"))

            String[] studentData = line.split("#");
            if (studentData.length == 4) {
                String studentId = studentData[0];
                String studentName = studentData[1];
                int entryYear = Integer.parseInt(studentData[2]);
                String major = studentData[3];

                Student newStudent = new Student(studentId, studentName, entryYear, major);
                students.add(newStudent);
            
            }
        }

        for (Student student : students) {
            System.out.println(student);
        }

        input.close();
    }

