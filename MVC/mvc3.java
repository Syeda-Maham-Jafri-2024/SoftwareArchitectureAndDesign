import java.util.ArrayList;
import java.util.List;

public class StudentModel {
    private List<Student> students = new ArrayList<>();

    public void addStudent(String name, int age) {
        students.add(new Student(name, age));
    }

    public List<Student> getStudents() {
        return students;
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

public class StudentView {
    private Scanner scanner = new Scanner(System.in);

    public String getStudentName() {
        System.out.print("Enter student name: ");
        return scanner.nextLine();
    }

    public int getStudentAge() {
        System.out.print("Enter student age: ");
        return scanner.nextInt();
    }

    public void displayStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
public class StudentController {
    private StudentModel model;
    private StudentView view;

    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void addStudent() {
        String name = view.getStudentName();
        int age = view.getStudentAge();
        model.addStudent(name, age);
    }

    public void displayStudents() {
        view.displayStudents(model.getStudents());
    }
}
public class StudentApp {
    public static void main(String[] args) {
        StudentModel model = new StudentModel();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.addStudent();
        controller.displayStudents();
    }
}
