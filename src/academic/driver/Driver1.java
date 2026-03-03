package academic.driver;

import academic.model.Course;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 12S24031 - Amelia Renata Lumbanbatu
 */
public class Driver1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Course> courses = new ArrayList<>();

        String line;
        while (input.hasNextLine() && !(line = input.nextLine()).equals("---")) {

            String[] courseData = line.split("#");
            if (courseData.length == 4) {
                String courseCode = courseData[0];
                String courseName = courseData[1];
                int credits = Integer.parseInt(courseData[2]);
                String grade = courseData[3];


                Course newCourse = new Course(courseCode, courseName, credits, grade);
                courses.add(newCourse);
        }
    }

    for (Course course : courses) {
        System.out.println(course);
    }

    input.close();
}

}