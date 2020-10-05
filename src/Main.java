import model.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("XChan",21,"Male",202001);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
        System.out.println(student.getIdNo());

        System.out.println();

        student.setName("Tayag");
        student.setAge(20);
        student.setGender("Female");
        student.setIdNo(202002);

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
        System.out.println(student.getIdNo());
    }
}
