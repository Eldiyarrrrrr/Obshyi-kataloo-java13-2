import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student students = new Student();
        Scanner scanner = new Scanner(System.in);
        Student[] array = new Student[2];
        int count = 0;

        while (true) {
            System.out.println("""
                    1. Add student
                    2. Get all student
                    3. Update
                    4. Delete
                    """);
            switch (new Scanner(System.in).nextLine()) {
                case "1", "add" -> {
                    students.addStudent();
                }
                case "2", "get" -> {
                    System.out.println(Arrays.toString(Student.students));
                    students.method(Student.students,count);
                }
                case "3", "update" -> {
                    students.update(scanner.nextLine(), Student.students);

                }
                case "4","delete" -> {
                    System.out.println("Введите номер заметки, которую хотите удалить: ");
                    String name = scanner.nextLine();
                    students.deleteStudent(Student.students,name);


                }
            }
        }
    }
}


