package exercises;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GradeManager {
    private Map<Integer, Student> students = new HashMap<>();

    public boolean addStudent(Student student) {
        return students.put(student.getStudentId(), student) == null;
    }

    public Student getStudent(int studentId) {
        return students.get(studentId);
    }

    public boolean updateGPA(int studentId, double newGPA) {
        Student student = students.get(studentId);
        if (student == null) {
            return false;
        }
        student.setGPA(newGPA);
        return true;
    }

    public Student removeStudent(int studentId) {
        return students.remove(studentId);
    }

    public void printAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students");
        } else {
            for (Student student : students.values()) {
                System.out.println(student);
            }
        }
    }

    public List<Student> getTopStudents(double minGPA) {
        List<Student> topStudents = new ArrayList<>();
        for (Student student : students.values()) {
            if (student.getStudentGpa() >= minGPA) {
                topStudents.add(student);
            }
        }
        return topStudents;
    }

    public double getAverageGPA() {
        if (students.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (Student student : students.values()) {
            sum+=student.getStudentGpa();
        }
        double average = sum / students.size();
        return Math.round(average * 100.0) / 100.0;
    }

    public int getStudentCount() {
        return students.size();
    }

    public static void main(String[] args) {
        GradeManager manager = new GradeManager();
        manager.addStudent(new Student(101, "Alice", 3.8));
        manager.addStudent(new Student(102, "Bob", 3.2));
        manager.addStudent(new Student(103, "Charlie", 3.9));
        manager.addStudent(new Student(104, "Diana", 2.7));
        manager.addStudent(new Student(105, "Eve", 3.6));

        System.out.println("Attempting to add duplicate ID 101...");
        if (!manager.addStudent(new Student(101, "Alice", 3.8))) {
            System.out.println("Failed! Student ID 101 already exists.");
        }
        
        System.out.println(""); 
        System.out.println("All students:");
        manager.printAllStudents();

        System.out.println(""); 
        System.out.println("Updating Bob's GPA 3.2 to 5");
        if (manager.updateGPA(102, 5)) {
            System.out.println("Update successfully");
        }
        System.out.println(manager.getStudent(102));

        System.out.println(""); 
        System.out.println("All students with GPA >= 3.5");
        System.out.println(manager.getTopStudents(3.5));

        System.out.println(""); 
        System.out.println("Average GPA:");
        System.out.println(manager.getAverageGPA());

        System.out.println(""); 
        System.out.println("Removing student Eve - ID 105");
        Student removed = manager.removeStudent(105);
        System.out.println(removed);
        System.out.println("All updated students without Eve:");
        manager.printAllStudents();
    }
    
}
