package academic.model;

/**
 * Representasi pendaftaran mata kuliah oleh mahasiswa.
 * @author 12S24031 - Amelia Renata Lumbanbatu
 */
public class Enrollment {
    private String courseCode;
    private String studentId;
    private String academicYear;
    private String semester;
    private String grade; // "None" jika belum ada nilai

    // Konstruktor untuk inisialisasi awal tanpa grade (grade default "None")
    public Enrollment(String courseCode, String studentId, String academicYear, String semester) {
        this.courseCode = courseCode;
        this.studentId = studentId;
        this.academicYear = academicYear;
        this.semester = semester;
        this.grade = "None"; // Default grade adalah "None" sesuai contoh output
    }

    // Konstruktor dengan grade (digunakan jika grade sudah diketahui saat pembuatan objek)
    public Enrollment(String courseCode, String studentId, String academicYear, String semester, String grade) {
        this.courseCode = courseCode;
        this.studentId = studentId;
        this.academicYear = academicYear;
        this.semester = semester;
        this.grade = grade;
    }

    // Getter untuk semua atribut
    public String getCourseCode() { // Perbaikan typo 'getCourceCode()' menjadi 'getCourseCode()'
        return courseCode;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public String getSemester() {
        return semester;
    }

    public String getGrade() {
        return grade;
    }

    // Setter untuk grade (jika grade bisa diubah nanti)
    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Metode untuk representasi String objek Enrollment
    @Override
    public String toString() {
        return courseCode + "|" + studentId + "|" + academicYear + "|" + semester + "|" + grade;
    }
}
