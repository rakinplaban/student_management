import java.util.ArrayList;

public class Teacher {
    private String username;
    private String password;
    private ArrayList<Student> students;

    public Teacher(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Roll Number: " + student.getRollNumber()  + ", Address: " + student.getAddress());
        }
    }


}