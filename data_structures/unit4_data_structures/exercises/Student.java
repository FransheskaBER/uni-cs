package exercises;

public class Student {
    private int studentId;
    private String name;
    private double gpa;

    public Student(int studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;   
    }

    public int getStudentId() {
        return this.studentId;
    }

    public String getStudentName() {
        return this.name;
    }

    public double getStudentGpa() {
        return this.gpa;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, GPA: %.2f", studentId, name, gpa);
    }
}
