package staticex;

public class StudentTest1 {
    public static void main(String[] args) {

        System.out.println(Student.serialNum);

        Student studentJ = new Student();
        System.out.println(studentJ.studentId);
        System.out.println(Student.serialNum);

        Student studentT = new Student();
        System.out.println(studentT.studentId);
        System.out.println(Student.serialNum);
    }
}
