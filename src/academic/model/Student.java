package academic.model;

/**
 * Representasi seorang mahasiswa.
 */
public class Student {
    private String studentId;
    private String studentName;
    private int entryYear;
    private String major;

    // Konstruktor
    public Student(String studentId, String studentName, int entryYear, String major) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.entryYear = entryYear;
        this.major = major;
    }

    // Getter untuk semua atribut
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

    // Metode untuk representasi String objek Student
    @Override
    public String toString() {
        return studentId + "|" + studentName + "|" + entryYear + "|" + major;
    }
}
