package lab2.Prob2A.ext;

import lab2.Prob2A.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Johnny Dang");
        assert student.getGradeReport().getStudent().getName().equals("Johnny Dang") : "Student name should be 'Johnny Dang'";
        assert student.getGradeReport().getStudent() == student : "GradeReport should reference the same Student instance";
        System.out.println("All assertions passed. Student and GradeReport are correctly linked.");
    }
}