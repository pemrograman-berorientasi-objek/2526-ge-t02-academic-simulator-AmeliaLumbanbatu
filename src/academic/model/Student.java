package academic.model;

/**
 * @author 12S24031 - Amelia Renata Lumbanbatu
 */
public class Student {
   private String studentId;
    private String studentName;
    private int entryYear;
    private String major; 

    public Student(String studentId, String studentName, int entryYear, String major) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.entryYear = entryYear;
        this.major = major;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getEntryYear() {
        return entryYear;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return studentId + "|" + studentName + "|" + entryYear + "|" + major;
    }

}