package test;

public class Student {
    int studentId;
    String studentName;
    int grade;
    String address;

    public Student(int id, String name, String add) {
        studentId = id;
        studentName = name;
        address = add;
    }

    public void showStudentInfo() {
        System.out.println(studentName + ", " + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }
}