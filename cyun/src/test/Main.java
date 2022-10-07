package test;

public class Main {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "mcdonald", "Korea Seoul");
        Student studenthwang = new Student(101, "mchammer", "Korea Lado");

        studentLee.showStudentInfo();
        studenthwang.showStudentInfo();

        System.out.println(studentLee);
        System.out.println(studenthwang);
    }
}

// signal and system 1030
// computer architecture 1029
// probability and random process 1023
// probability and statics 1019
// database 1020