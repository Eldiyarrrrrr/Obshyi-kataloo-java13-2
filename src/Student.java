import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;

    public static Student[] students = {};


    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getInfo() {
        return STR. "Full  name: \{ getFirstName() } | Telephone : \{ getLastName() }()} | Aparment: \{ getEmail() } | Banky: \{ getAge() }" ;
    }

    public void addStudent() {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("ID студента");
        student.setId(scanner1.nextInt());
        System.out.println("Имя студента ?");
        student.setFirstName(scanner.nextLine());
        System.out.println("Фамилия студента ?");
        student.setLastName(scanner.nextLine());
        System.out.println("Email студента ?");
        student.setEmail(scanner.nextLine());
        if (student.getEmail().contains("@gmail.com")) {

            System.out.println("Возраст студента ?");
            student.setAge(scanner1.nextInt());
            students = Arrays.copyOf(students, students.length + 1);
            students[students.length - 1] = student;


        } else {
            System.out.println("emaildyn ichinde @gmail.com jok");
            return;
        }
    }

    public void method(Student[] students,int count) {
        for (int i = 0; i < count; i++) {
            if (students[i] != null) {
                System.out.println(students[i]);
            }
        }
    }

    public void update(String name, Student[] students) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanFor = new Scanner(System.in);
        for (Student student : students) {
            if (name.equalsIgnoreCase(student.getFirstName())) {
                System.out.print("Write firstName: ");
                student.setFirstName(scanner.nextLine());
                System.out.print("Write lastName: ");
                student.setLastName(scanFor.nextLine());
                System.out.print("Write email: ");
                student.setEmail(scanner.nextLine());
                System.out.println("Write age: ");
                student.setAge(scanner.nextInt());
            }
        }
        for (Student fsf : students) {
            System.out.println(fsf.getInfo());
        }
    }



    public void deleteStudent(Student[] students, String email) {
    boolean isFound = false;
        for (Student s:students) {
            if(s.getEmail().equalsIgnoreCase(email)){
                s.setAge(0);
                s.setEmail(null);
                s.setId(0);
                s.setFirstName(null);
                s.setLastName(null);
            }else System.out.println("Not found");

        }
    }



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}

