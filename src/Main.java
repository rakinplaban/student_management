import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Scanner scanner = new Scanner(System.in);
        int choice;
        while(true){
            System.out.println("1. Admin login");
            System.out.println("2. Teacher login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int login_as = scanner.nextInt();

            switch (login_as) {
                case 1:
                    System.out.print("Enter username : ");
                    String username = scanner.next();
                    System.out.print("Enter username : ");
                    String password = scanner.next();
                    if (admin.authentication(username,password)==true) {
                        do {
                            System.out.println("1. Add student");
                            System.out.println("2. Delete student");
                            System.out.println("3. Update student");
                            System.out.println("4. Create teacher account");
                            System.out.println("5. Exit");

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
                                    admin.add_student(new Student(name, roll, address));
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
                                    String teacher_username = scanner.next();
                                    System.out.print("Enter password: ");
                                    String teacher_password = scanner.next();
                                    admin.createTeacher(teacher_username, teacher_password);
                                    break;

                                default:
                                    System.out.println("Exited");
                                    break;
                            }

                        } while (choice != 5);


                    }
                    else{
                        System.out.println("Authentication Failed as admin user");
                    }
//                    exit(0);

                case 2:
                    System.out.println("logging in as a teacher.");
                    System.out.print("Enter username : ");
                    String t_username = scanner.next();
                    System.out.print("Enter username : ");
                    String t_password = scanner.next();
                    // if (t_username.equals(teacher.username) && t_password.equals(teacher.password))
                    Teacher teacher = new Teacher(t_username,t_password);
                    if(teacher.authentication(t_username,t_password) == true){
                        teacher.displayStudents();
                    }
                    else{
                        exit(0);
                    }

                case 3:
                    exit(0);

            }
            }
        }

//        scanner.close();

}