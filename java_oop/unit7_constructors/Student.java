package unit7_constructors;

public class Student extends Person {
    private String studentId;
    private double gpa;

    public Student(String name, int age, String id) {
        super(name, age);
        this.studentId = id;
        this.gpa = 0.0;
    }

    public Student(String name, int age, String id, double gpa) {
        this(name, age, id);
        this.gpa = gpa;
    }

    public void printInfo() {
        System.out.println("Name: " + name + " ID: " + studentId + " GPA: " + gpa + " Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Fransheska", 33, "12345");
        s1.printInfo();

        Student s2 = new Student("Yuriko", 23, "45677", 20.4);
        s2.printInfo();
    }
}
