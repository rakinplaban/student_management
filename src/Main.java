import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin("admin", "password");

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add student");
            System.out.println("2. Delete student");
            System.out.println("3. Update student");
            System.out.println("4. Create teacher account");
            System.out.println("5. View student list");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter roll number: ");
                    int roll = scanner.nextInt();
                    System.out.print("Enter address: ");
                    String address = scanner.next();
                    admin.add_student(new Student(name, roll,  address));
                    break;
                case 2:
                    System.out.print("Enter roll number: ");
                    roll = scanner.nextInt();
                    admin.deleteStudent(roll);
                    break;
                case 3:
                    System.out.print("Enter name: ");
                    name = scanner.next();
                    System.out.print("Enter roll number: ");
                    roll = scanner.nextInt();
                    System.out.print("Enter age: ");

                    System.out.print("Enter address: ");
                    address = scanner.next();
                    admin.updateStudent(new Student(name, roll, address));
                    break;
                case 4:
                    System.out.print("Enter username: ");
                    String username = scanner.next();
                    System.out.print("Enter password: ");
                    String password = scanner.next();
                    admin.createTeacher(username, password);
                    break;
//                case 5:
//                    for (Student student : admin.getStudents()) {
//                        System.out.println(student);
//                    }
//                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        } while (choice != 6);

        scanner.close();
    }
}
